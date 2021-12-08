package cn.lakex.hidy.core.result;

import java.io.Serializable;

/**
 * IResultCode 状态码接口
 *
 * @author 阿古
 * @version 1.0
 * @date 2021-04-13 14:12
 */
public interface IResultCode extends Serializable {

    /**
     * 返回的code码
     *
     * @return code
     */
    int getCode();

    /**
     * 返回的消息
     *
     * @return 消息
     */
    default String getMsg() {
        return "系统未知异常";
    }
}
