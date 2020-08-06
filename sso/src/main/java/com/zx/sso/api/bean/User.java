package com.zx.sso.api.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Title: User
 * Description: user
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin@thunisoft.com
 * @version 1.0
 * date 2019/9/10 15:02
 */
@Data
@ApiModel("用户实体")
public class User {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("loginId")
    private String loginId;

    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("用户登录密码")
    private String password;

    @ApiModelProperty("创建时间")
    private Date createdTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}
