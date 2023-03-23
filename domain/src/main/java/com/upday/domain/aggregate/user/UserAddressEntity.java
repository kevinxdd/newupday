package com.upday.domain.aggregate.user;
/**
 * Create by xdd on 2023/3/23.
 */

import lombok.Getter;

/**
 *  用户地址对象
 *
 * @author xdd
 */
@Getter
public class UserAddressEntity {

  private String addressId;

  private String receiveName;

  private String mobile;

  private Long provinceId;

  private String provinceName;

  private Long cityId;

  private String cityName;

  private Long districtId;

  private String districtName;

  UserAddressEntity(String receiveName, String mobile, Long provinceId, String provinceName,
      Long cityId, String cityName, Long districtId, String districtName) {
    this.receiveName = receiveName;
    this.mobile = mobile;
    this.provinceId = provinceId;
    this.provinceName = provinceName;
    this.cityId = cityId;
    this.cityName = cityName;
    this.districtId = districtId;
    this.districtName = districtName;
  }
}
