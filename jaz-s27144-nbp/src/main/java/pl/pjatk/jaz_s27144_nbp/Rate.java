package pl.pjatk.jaz_s27144_nbp;

import java.util.List;

public class Rate {
    public String getNo() {
        return no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public double getMid() {
        return mid;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    private String no;
    private String effectiveDate;
    private double mid;

    public class CurrencyRate {
        public String getCurrency() {
            return currency;
        }

        public String getCode() {
            return code;
        }

        public List<Rate> getRates() {
            return rates;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void setRates(List<Rate> rates) {
            this.rates = rates;
        }

        private String currency;
        private String code;
        private List<Rate> rates;

    }

}