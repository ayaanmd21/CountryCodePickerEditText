package faizzy.coutrydialog;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sukrit on 28/4/17.
 */

public class CCPEditText extends android.support.v7.widget.AppCompatEditText {
    private  Context mContext;
    public CCPEditText(Context context) {
        super(context);
        mContext=context;
        init();
    }

    public CCPEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext=context;
        init();
    }

    public CCPEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext=context;
        init();
    }

    private void init(){
        CCPEditText.this.setFocusable(false);
        CCPEditText.this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                showCodePicker();
            }
        });
    }



    private void showCodePicker() {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(mContext);
        LayoutInflater layoutInflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        LayoutInflater layoutInflater = .getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.dialog_country_code_picker, null);
        alertDialog.setView(view);
        alertDialog.setNegativeButton("cancel", null);
        alertDialog.setCancelable(false);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rc_country_list);
        final EditText searchView = (EditText) view.findViewById(R.id.sv_country);
        final TextView noData = (TextView) view.findViewById(R.id.tv_nodata);

        final AlertDialog dialog = alertDialog.create();

        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialogInterface) {
                final CountryAdapter countryAdapter = new CountryAdapter(CountryCode.getCountryCode());

                dialog.getButton(AlertDialog.BUTTON_NEGATIVE).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });


                recyclerView.setAdapter(countryAdapter);
                countryAdapter.setmListener(new CountryCodeListener() {
                    @Override
                    public void onContryItemClick(String mobileCode) {
                        if (!TextUtils.isEmpty(mobileCode))
                            CCPEditText.this.setText("+" + mobileCode);
                        else
                            CCPEditText.this.setText("+91");
                        dialog.dismiss();
                    }
                });
                searchView.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        List<CountryCode> mCountryCodes = CountryCode.getSearchCountry(s);
                        if(mCountryCodes.isEmpty()){
                            noData.setVisibility(View.VISIBLE);
                            recyclerView.setVisibility(GONE);
                        }else {
                            recyclerView.setVisibility(VISIBLE);
                            noData.setVisibility(View.GONE);
                            countryAdapter.setCountryCodes(mCountryCodes);
                            recyclerView.getAdapter().notifyDataSetChanged();
                        }

                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });

            }


        });

        dialog.show();

    }


    private class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.MyViewHolder> {
        private CountryCodeListener mListener;

        private void setCountryCodes(List<CountryCode> countryCodes) {
            this.countryCodes = countryCodes;
        }

        private List<CountryCode> countryCodes;

        private void setmListener(CountryCodeListener mListener) {
            this.mListener = mListener;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            private TextView tvcountryIso, tvCountryName, tvMobileCode;

            public MyViewHolder(View view) {
                super(view);
                tvcountryIso = (TextView) view.findViewById(R.id.tv_country_iso_code);
                tvCountryName = (TextView) view.findViewById(R.id.tv_country_name);
                tvMobileCode = (TextView) view.findViewById(R.id.tv_country_mobile_code);
            }
        }


        private CountryAdapter(List<CountryCode> countryCodes) {
            this.countryCodes = countryCodes;
        }

        @Override
        public CountryAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.country_code_item, parent, false);

            return new CountryAdapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(CountryAdapter.MyViewHolder holder, int position) {
            final CountryCode countryCode = countryCodes.get(position);
            holder.tvCountryName.setText(countryCode.getCountryName());
            holder.tvcountryIso.setText("(" + countryCode.getCountryIsoCode().toUpperCase() + ")");
            holder.tvMobileCode.setText("+"+countryCode.getCountryMobileCode());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mListener.onContryItemClick(countryCode.getCountryMobileCode());
                }
            });
        }

        @Override
        public int getItemCount() {
            return countryCodes.size();
        }
    }


    private interface CountryCodeListener {
        void onContryItemClick(String mobileCode);
    }
}
