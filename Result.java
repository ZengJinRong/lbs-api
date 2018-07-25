

/**
 * 反馈结果类，用于服务器端与安卓端的消息通信
 */
public class Result<T> {

    private int status;         //状态码
    private String message;     //状态消息
    private T results;          //数据结果集

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getResults() {
        return results;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setResults(T results) {
        this.results = results;
    }

}
