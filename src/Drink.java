public class Drink extends Product {
    private String producttype="Drink";
    private String Unit="kr/liter";
    public static final long serialVersionUID =-244024137569869940L;

    public Drink(String productname,Double prices){
            super(productname,prices);
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }


}
