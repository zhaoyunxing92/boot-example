/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing Technology Co., Ltd. All rights reserved.
 */
package com.sunny.boot.example.core;

import org.springframework.context.annotation.Import;

/**
 * @author zhaoyunxing
 * @class: com.sunny.boot.example.core.AppConfig
 * @date: 2018-07-09 09:44
 * @des:
 */
@Import({AppDataSourceConfig.class, AppMyBatisConfig.class})
public class AppConfig {
}
