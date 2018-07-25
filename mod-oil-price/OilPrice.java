
/**
 * 油价数据POJO
 */
public class OilPrice {
    private String dieselOil0;  //0号柴油价格
    private String gasoline90;  //90号汽油价格
    private String gasoline93;  //93号汽油价格
    private String gasoline97;  //97号汽油价格
    private String province;    //省份

    public String getDieselOil0() {
        return dieselOil0;
    }

    public void setDieselOil0(String dieselOil0) {
        this.dieselOil0 = dieselOil0;
    }

    public String getGasoline90() {
        return gasoline90;
    }

    public void setGasoline90(String gasoline90) {
        this.gasoline90 = gasoline90;
    }

    public String getGasoline93() {
        return gasoline93;
    }

    public void setGasoline93(String gasoline93) {
        this.gasoline93 = gasoline93;
    }

    public String getGasoline97() {
        return gasoline97;
    }

    public void setGasoline97(String gasoline97) {
        this.gasoline97 = gasoline97;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
