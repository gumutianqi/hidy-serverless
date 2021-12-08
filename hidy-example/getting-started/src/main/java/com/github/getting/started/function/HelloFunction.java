package com.github.getting.started.function;

import cn.lakex.hidy.core.result.R;
import com.github.getting.started.config.AppConstant;
import lombok.extern.log4j.Log4j2;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * <p>Hello Function</p>
 * <p></p>
 *
 * @author 阿古 (larrykoo@126.com)
 * @date 2021/12/8 11:45
 * @since 1.0.0
 */
@Log4j2
@Path(AppConstant.ROOT_PATH + "/hello")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HelloFunction {

    @GET
    @Path("/f1")
    public R<?> helloF1() {
        log.info("I am F1.");
        return R.success("I am F1");
    }

    @GET
    @Path("/f2")
    public R<?> helloF2() {
        log.info("I am F2.");
        return R.success("I am F2");
    }
}
