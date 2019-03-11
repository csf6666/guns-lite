package cn.enilu.guns.bean.vo.front;

public class Rets {

    public static final String SUCCESS = "0000";
    public static final String FAILURE = "9999";

    public static Ret success(Object data) {
        return new Ret(Rets.SUCCESS, "成功", data);
    }

    public static Ret failure(String msg) {
        return new Ret(Rets.FAILURE, msg, null);
    }

    public static Ret success() {
        return new Ret(Rets.SUCCESS, "成功", null);
    }
}
