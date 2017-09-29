package faizzy.coutrydialog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by faizan on 27/4/17.
 */

public class CountryCode {
    private String countryName;
    private String countryIsoCode;

    public String getCountryName() {
        return countryName;
    }

    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public String getCountryMobileCode() {
        return countryMobileCode;
    }

    private String countryMobileCode;
    private CountryCode(String countryIsoCode,String countryMobileCode,String countryName) {
        this.countryIsoCode=countryIsoCode;
        this.countryMobileCode=countryMobileCode;
        this.countryName=countryName;
    }

    public static List<CountryCode> getCountryCode(){

        List<CountryCode> countries = new ArrayList<>();
        countries.add(new CountryCode("af", "93", "Afghanistan"));
        countries.add(new CountryCode("al", "355", "Albania"));
        countries.add(new CountryCode("dz", "213", "Algeria"));
        countries.add(new CountryCode("ad", "376", "Andorra"));
        countries.add(new CountryCode("ao", "244", "Angola"));
        countries.add(new CountryCode("ai", "1", "Anguilla"));
        countries.add(new CountryCode("aq", "672", "Antarctica"));
        countries.add(new CountryCode("ag", "1", "Antigua and Barbuda"));
        countries.add(new CountryCode("ar", "54", "Argentina"));
        countries.add(new CountryCode("am", "374", "Armenia"));
        countries.add(new CountryCode("aw", "297", "Aruba"));
        countries.add(new CountryCode("au", "61", "Australia"));
        countries.add(new CountryCode("at", "43", "Austria"));
        countries.add(new CountryCode("az", "994", "Azerbaijan"));
        countries.add(new CountryCode("bs", "1", "Bahamas"));
        countries.add(new CountryCode("bh", "973", "Bahrain"));
        countries.add(new CountryCode("bd", "880", "Bangladesh"));
        countries.add(new CountryCode("bb", "1", "Barbados"));
        countries.add(new CountryCode("by", "375", "Belarus"));
        countries.add(new CountryCode("be", "32", "Belgium"));
        countries.add(new CountryCode("bz", "501", "Belize"));
        countries.add(new CountryCode("bj", "229", "Benin"));
        countries.add(new CountryCode("bm", "1", "Bermuda"));
        countries.add(new CountryCode("bt", "975", "Bhutan"));
        countries.add(new CountryCode("bo", "591", "Bolivia, Plurinational State Of"));
        countries.add(new CountryCode("ba", "387", "Bosnia And Herzegovina"));
        countries.add(new CountryCode("bw", "267", "Botswana"));
        countries.add(new CountryCode("br", "55", "Brazil"));
        countries.add(new CountryCode("vg", "1", "British Virgin Islands"));
        countries.add(new CountryCode("bn", "673", "Brunei Darussalam"));
        countries.add(new CountryCode("bg", "359", "Bulgaria"));
        countries.add(new CountryCode("bf", "226", "Burkina Faso"));
        countries.add(new CountryCode("mm", "95", "Myanmar"));
        countries.add(new CountryCode("bi", "257", "Burundi"));
        countries.add(new CountryCode("kh", "855", "Cambodia"));
        countries.add(new CountryCode("cm", "237", "Cameroon"));
        countries.add(new CountryCode("ca", "1", "Canada"));
        countries.add(new CountryCode("cv", "238", "Cape Verde"));
        countries.add(new CountryCode("ky", "1", "Cayman Islands"));
        countries.add(new CountryCode("cf", "236", "Central African Republic"));
        countries.add(new CountryCode("td", "235", "Chad"));
        countries.add(new CountryCode("cl", "56", "Chile"));
        countries.add(new CountryCode("cn", "86", "China"));
        countries.add(new CountryCode("cx", "61", "Christmas Island"));
        countries.add(new CountryCode("cc", "61", "Cocos (keeling) Islands"));
        countries.add(new CountryCode("co", "57", "Colombia"));
        countries.add(new CountryCode("km", "269", "Comoros"));
        countries.add(new CountryCode("cg", "242", "Congo"));
        countries.add(new CountryCode("cd", "243", "Congo, The Democratic Republic Of The"));
        countries.add(new CountryCode("ck", "682", "Cook Islands"));
        countries.add(new CountryCode("cr", "506", "Costa Rica"));
        countries.add(new CountryCode("hr", "385", "Croatia"));
        countries.add(new CountryCode("cu", "53", "Cuba"));
        countries.add(new CountryCode("cy", "357", "Cyprus"));
        countries.add(new CountryCode("cz", "420", "Czech Republic"));
        countries.add(new CountryCode("dk", "45", "Denmark"));
        countries.add(new CountryCode("dj", "253", "Djibouti"));
        countries.add(new CountryCode("dm", "1", "Dominica"));
        countries.add(new CountryCode("do", "1", "Dominican Republic"));
        countries.add(new CountryCode("tl", "670", "Timor-leste"));
        countries.add(new CountryCode("ec", "593", "Ecuador"));
        countries.add(new CountryCode("eg", "20", "Egypt"));
        countries.add(new CountryCode("sv", "503", "El Salvador"));
        countries.add(new CountryCode("gq", "240", "Equatorial Guinea"));
        countries.add(new CountryCode("er", "291", "Eritrea"));
        countries.add(new CountryCode("ee", "372", "Estonia"));
        countries.add(new CountryCode("et", "251", "Ethiopia"));
        countries.add(new CountryCode("fk", "500", "Falkland Islands (malvinas)"));
        countries.add(new CountryCode("fo", "298", "Faroe Islands"));
        countries.add(new CountryCode("fj", "679", "Fiji"));
        countries.add(new CountryCode("fi", "358", "Finland"));
        countries.add(new CountryCode("fr", "33", "France"));
        countries.add(new CountryCode("gf", "594", "French Guyana"));
        countries.add(new CountryCode("pf", "689", "French Polynesia"));
        countries.add(new CountryCode("ga", "241", "Gabon"));
        countries.add(new CountryCode("gm", "220", "Gambia"));
        countries.add(new CountryCode("ge", "995", "Georgia"));
        countries.add(new CountryCode("de", "49", "Germany"));
        countries.add(new CountryCode("gh", "233", "Ghana"));
        countries.add(new CountryCode("gi", "350", "Gibraltar"));
        countries.add(new CountryCode("gr", "30", "Greece"));
        countries.add(new CountryCode("gl", "299", "Greenland"));
        countries.add(new CountryCode("gd", "1", "Grenada"));
        countries.add(new CountryCode("gt", "502", "Guatemala"));
        countries.add(new CountryCode("gn", "224", "Guinea"));
        countries.add(new CountryCode("gw", "245", "Guinea-bissau"));
        countries.add(new CountryCode("gy", "592", "Guyana"));
        countries.add(new CountryCode("ht", "509", "Haiti"));
        countries.add(new CountryCode("hn", "504", "Honduras"));
        countries.add(new CountryCode("hk", "852", "Hong Kong"));
        countries.add(new CountryCode("hu", "36", "Hungary"));
        countries.add(new CountryCode("in", "91", "India"));
        countries.add(new CountryCode("id", "62", "Indonesia"));
        countries.add(new CountryCode("ir", "98", "Iran, Islamic Republic Of"));
        countries.add(new CountryCode("iq", "964", "Iraq"));
        countries.add(new CountryCode("ie", "353", "Ireland"));
        countries.add(new CountryCode("im", "44", "Isle Of Man"));
        countries.add(new CountryCode("il", "972", "Israel"));
        countries.add(new CountryCode("it", "39", "Italy"));
        countries.add(new CountryCode("ci", "225", "Côte D\'ivoire"));
        countries.add(new CountryCode("jm", "1", "Jamaica"));
        countries.add(new CountryCode("jp", "81", "Japan"));
        countries.add(new CountryCode("jo", "962", "Jordan"));
        countries.add(new CountryCode("kz", "7", "Kazakhstan"));
        countries.add(new CountryCode("ke", "254", "Kenya"));
        countries.add(new CountryCode("ki", "686", "Kiribati"));
        countries.add(new CountryCode("kw", "965", "Kuwait"));
        countries.add(new CountryCode("kg", "996", "Kyrgyzstan"));
        countries.add(new CountryCode("la", "856", "Lao People\'s Democratic Republic"));
        countries.add(new CountryCode("lv", "371", "Latvia"));
        countries.add(new CountryCode("lb", "961", "Lebanon"));
        countries.add(new CountryCode("ls", "266", "Lesotho"));
        countries.add(new CountryCode("lr", "231", "Liberia"));
        countries.add(new CountryCode("ly", "218", "Libya"));
        countries.add(new CountryCode("li", "423", "Liechtenstein"));
        countries.add(new CountryCode("lt", "370", "Lithuania"));
        countries.add(new CountryCode("lu", "352", "Luxembourg"));
        countries.add(new CountryCode("mo", "853", "Macao"));
        countries.add(new CountryCode("mk", "389", "Macedonia, The Former Yugoslav Republic Of"));
        countries.add(new CountryCode("mg", "261", "Madagascar"));
        countries.add(new CountryCode("mw", "265", "Malawi"));
        countries.add(new CountryCode("my", "60", "Malaysia"));
        countries.add(new CountryCode("mv", "960", "Maldives"));
        countries.add(new CountryCode("ml", "223", "Mali"));
        countries.add(new CountryCode("mt", "356", "Malta"));
        countries.add(new CountryCode("mh", "692", "Marshall Islands"));
        countries.add(new CountryCode("mq", "596", "Martinique"));
        countries.add(new CountryCode("mr", "222", "Mauritania"));
        countries.add(new CountryCode("mu", "230", "Mauritius"));
        countries.add(new CountryCode("yt", "262", "Mayotte"));
        countries.add(new CountryCode("mx", "52", "Mexico"));
        countries.add(new CountryCode("fm", "691", "Micronesia, Federated States Of"));
        countries.add(new CountryCode("md", "373", "Moldova, Republic Of"));
        countries.add(new CountryCode("mc", "377", "Monaco"));
        countries.add(new CountryCode("mn", "976", "Mongolia"));
        countries.add(new CountryCode("ms", "1", "Montserrat"));
        countries.add(new CountryCode("me", "382", "Montenegro"));
        countries.add(new CountryCode("ma", "212", "Morocco"));
        countries.add(new CountryCode("mz", "258", "Mozambique"));
        countries.add(new CountryCode("na", "264", "Namibia"));
        countries.add(new CountryCode("nr", "674", "Nauru"));
        countries.add(new CountryCode("np", "977", "Nepal"));
        countries.add(new CountryCode("nl", "31", "Netherlands"));
        countries.add(new CountryCode("nc", "687", "New Caledonia"));
        countries.add(new CountryCode("nz", "64", "New Zealand"));
        countries.add(new CountryCode("ni", "505", "Nicaragua"));
        countries.add(new CountryCode("ne", "227", "Niger"));
        countries.add(new CountryCode("ng", "234", "Nigeria"));
        countries.add(new CountryCode("nu", "683", "Niue"));
        countries.add(new CountryCode("kp", "850", "North Korea"));
        countries.add(new CountryCode("no", "47", "Norway"));
        countries.add(new CountryCode("om", "968", "Oman"));
        countries.add(new CountryCode("pk", "92", "Pakistan"));
        countries.add(new CountryCode("pw", "680", "Palau"));
        countries.add(new CountryCode("pa", "507", "Panama"));
        countries.add(new CountryCode("pg", "675", "Papua New Guinea"));
        countries.add(new CountryCode("py", "595", "Paraguay"));
        countries.add(new CountryCode("pe", "51", "Peru"));
        countries.add(new CountryCode("ph", "63", "Philippines"));
        countries.add(new CountryCode("pn", "870", "Pitcairn"));
        countries.add(new CountryCode("pl", "48", "Poland"));
        countries.add(new CountryCode("pt", "351", "Portugal"));
        countries.add(new CountryCode("pr", "1", "Puerto Rico"));
        countries.add(new CountryCode("qa", "974", "Qatar"));
        countries.add(new CountryCode("re", "262", "Réunion"));
        countries.add(new CountryCode("ro", "40", "Romania"));
        countries.add(new CountryCode("ru", "7", "Russian Federation"));
        countries.add(new CountryCode("rw", "250", "Rwanda"));
        countries.add(new CountryCode("bl", "590", "Saint Barthélemy"));
        countries.add(new CountryCode("kn", "1", "Saint Kitts and Nevis"));
        countries.add(new CountryCode("lc", "1", "Saint Lucia"));
        countries.add(new CountryCode("vc", "1", "Saint Vincent & The Grenadines"));
        countries.add(new CountryCode("ws", "685", "Samoa"));
        countries.add(new CountryCode("sm", "378", "San Marino"));
        countries.add(new CountryCode("st", "239", "Sao Tome And Principe"));
        countries.add(new CountryCode("sa", "966", "Saudi Arabia"));
        countries.add(new CountryCode("sn", "221", "Senegal"));
        countries.add(new CountryCode("rs", "381", "Serbia"));
        countries.add(new CountryCode("sc", "248", "Seychelles"));
        countries.add(new CountryCode("sl", "232", "Sierra Leone"));
        countries.add(new CountryCode("sg", "65", "Singapore"));
        countries.add(new CountryCode("sx", "1", "Sint Maarten"));
        countries.add(new CountryCode("sk", "421", "Slovakia"));
        countries.add(new CountryCode("si", "386", "Slovenia"));
        countries.add(new CountryCode("sb", "677", "Solomon Islands"));
        countries.add(new CountryCode("so", "252", "Somalia"));
        countries.add(new CountryCode("za", "27", "South Africa"));
        countries.add(new CountryCode("kr", "82", "South Korea"));
        countries.add(new CountryCode("es", "34", "Spain"));
        countries.add(new CountryCode("lk", "94", "Sri Lanka"));
        countries.add(new CountryCode("sh", "290", "Saint Helena, Ascension And Tristan Da Cunha"));
        countries.add(new CountryCode("pm", "508", "Saint Pierre And Miquelon"));
        countries.add(new CountryCode("sd", "249", "Sudan"));
        countries.add(new CountryCode("sr", "597", "Suriname"));
        countries.add(new CountryCode("sz", "268", "Swaziland"));
        countries.add(new CountryCode("se", "46", "Sweden"));
        countries.add(new CountryCode("ch", "41", "Switzerland"));
        countries.add(new CountryCode("sy", "963", "Syrian Arab Republic"));
        countries.add(new CountryCode("tw", "886", "Taiwan, Province Of China"));
        countries.add(new CountryCode("tj", "992", "Tajikistan"));
        countries.add(new CountryCode("tz", "255", "Tanzania, United Republic Of"));
        countries.add(new CountryCode("th", "66", "Thailand"));
        countries.add(new CountryCode("tg", "228", "Togo"));
        countries.add(new CountryCode("tk", "690", "Tokelau"));
        countries.add(new CountryCode("to", "676", "Tonga"));
        countries.add(new CountryCode("tt", "1", "Trinidad & Tobago"));
        countries.add(new CountryCode("tn", "216", "Tunisia"));
        countries.add(new CountryCode("tr", "90", "Turkey"));
        countries.add(new CountryCode("tm", "993", "Turkmenistan"));
        countries.add(new CountryCode("tc", "1", "Turks and Caicos Islands"));
        countries.add(new CountryCode("tv", "688", "Tuvalu"));
        countries.add(new CountryCode("ae", "971", "United Arab Emirates"));
        countries.add(new CountryCode("ug", "256", "Uganda"));
        countries.add(new CountryCode("gb", "44", "United Kingdom"));
        countries.add(new CountryCode("ua", "380", "Ukraine"));
        countries.add(new CountryCode("uy", "598", "Uruguay"));
        countries.add(new CountryCode("us", "1", "United States"));
        countries.add(new CountryCode("vi", "1", "US Virgin Islands"));
        countries.add(new CountryCode("uz", "998", "Uzbekistan"));
        countries.add(new CountryCode("vu", "678", "Vanuatu"));
        countries.add(new CountryCode("va", "39", "Holy See (vatican City State)"));
        countries.add(new CountryCode("ve", "58", "Venezuela, Bolivarian Republic Of"));
        countries.add(new CountryCode("vn", "84", "Viet Nam"));
        countries.add(new CountryCode("wf", "681", "Wallis And Futuna"));
        countries.add(new CountryCode("ye", "967", "Yemen"));
        countries.add(new CountryCode("zm", "260", "Zambia"));
        countries.add(new CountryCode("zw", "263", "Zimbabwe"));
        return countries;

    }

    public static  List<CountryCode> getSearchCountry(CharSequence chr){
        List<CountryCode> countryCode=getCountryCode();
        List<CountryCode>search=new ArrayList<>();
        for (int i=0; i<countryCode.size(); i++){
            if(countryCode.get(i).countryName.contains(chr.toString().toLowerCase())|| countryCode.get(i).countryMobileCode.contains(chr) ){
                search.add(countryCode.get(i));
            }
        }
        return search;
    }
}
