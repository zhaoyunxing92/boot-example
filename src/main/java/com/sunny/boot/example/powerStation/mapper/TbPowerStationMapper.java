/**
 * Copyright(C) 2018 Hangzhou sunny Technology Co., Ltd. All rights reserved.
 */
package com.sunny.boot.example.powerStation.mapper;

import com.sunny.boot.example.common.mapper.BaseMapper;
import com.sunny.boot.example.powerStation.model.TbPowerStation;
import org.springframework.stereotype.Repository;

@Repository
public interface TbPowerStationMapper extends BaseMapper<TbPowerStation, Long> {
}