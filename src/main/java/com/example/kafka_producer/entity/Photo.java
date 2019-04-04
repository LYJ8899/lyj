package com.example.kafka_producer.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
/**
 * 
 * @author 消息队列实体
 *
 */
@SuppressWarnings("all")
public class Photo implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -9082093886298473419L;

	/**
	 * 平台id（接入码占，四个字节，下一级平台的唯一标识，在数据头里边）
	 */
	private int plateId;
	/**
	 * 车牌号
	 */
	private String vehNo;

	/**
	 * 车牌颜色编码
	 */
	private int plateColorCode;
	/**
	 * gps时间(定位时间)
	 */
	private LocalDateTime gpstime;
	/**
	 * 经度
	 */
	private double lon;
	/**
	 * 纬度
	 */
	private double lat;
	/**
	 * 速度
	 */
	private int speed;
	/**
	 * 仪表速度<用处不大>
	 */
	private int rSpeed;
	/**
	 * 方向角
	 */
	private int direction;
	/**
	 * 海拔
	 */
	private int altitude;
	/**
	 * 车辆状态
	 */
	private long vehStatus;

	/**
	 * 报警状态
	 */
	private long warnStatus;
	/**
	 * 通道号（镜头ID）
	 */
	private int cameraid;
	/**
	 * 存储相对路径
	 */
	private String photoPath;

	/**
	 * 图片格式(自定义字段)
	 */
	private String photoFormat;

	/**
	 * 系统时间
	 */
	private LocalDateTime addTime;

	private transient boolean realPhoto;

	public LocalDateTime getGpstime() {
		return gpstime;
	}

	public void setGpstime(LocalDateTime gpstime) {
		this.gpstime = gpstime;
	}

	public LocalDateTime getAddtime() {
		return addTime;
	}

	public void setAddtime(LocalDateTime addTime) {
		this.addTime = addTime;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCameraid() {
		return cameraid;
	}

	public void setCameraid(int cameraid) {
		this.cameraid = cameraid;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public int getPlateId() {
		return plateId;
	}

	public void setPlateId(int plateId) {
		this.plateId = plateId;
	}

	public String getPhotoFormat() {
		return photoFormat;
	}

	public void setPhotoFormat(String photoFormat) {
		this.photoFormat = photoFormat;
	}

	/**
	 * @return the vehNo
	 */
	public String getVehNo() {
		return vehNo;
	}

	/**
	 * @param vehNo
	 *            the vehNo to set
	 */
	public void setVehNo(String vehNo) {
		this.vehNo = vehNo;
	}

	/**
	 * @return the plateColorcode
	 */
	public int getPlateColorcode() {
		return plateColorCode;
	}

	/**
	 * @param plateColorcode
	 *            the plateColorcode to set
	 */
	public void setPlateColorcode(int plateColorcode) {
		plateColorCode = plateColorcode;
	}

	/**
	 * @return the rSpeed
	 */
	public int getrSpeed() {
		return rSpeed;
	}

	/**
	 * @param rSpeed
	 *            the rSpeed to set
	 */
	public void setrSpeed(int rSpeed) {
		this.rSpeed = rSpeed;
	}

	/**
	 * @return the direction
	 */
	public int getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}

	/**
	 * @return the altitude
	 */
	public int getAltitude() {
		return altitude;
	}

	/**
	 * @param altitude
	 *            the altitude to set
	 */
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	/**
	 * @return the vehStatus
	 */
	public long getVehStatus() {
		return vehStatus;
	}

	/**
	 * @param vehStatus
	 *            the vehStatus to set
	 */
	public void setVehStatus(long vehStatus) {
		this.vehStatus = vehStatus;
	}

	/**
	 * @return the warnStatus
	 */
	public long getWarnStatus() {
		return warnStatus;
	}

	/**
	 * @param warnStatus
	 *            the warnStatus to set
	 */
	public void setWarnStatus(long warnStatus) {
		this.warnStatus = warnStatus;
	}

	@Override
	public String toString() {
		return "Photo{" + "vehicleNum='" + vehNo + '\'' + ", vehicleColor=" + plateColorCode + ", gpstime=" + gpstime
				+ ", lon=" + lon + ", lat=" + lat + ", speed=" + speed + ", cameraid=" + cameraid + ", photoPath='"
				+ photoPath + '\'' + ", addTime=" + addTime + ", plateId=" + plateId + ", photoFormat='" + photoFormat
				+ '\'' + '}';
	}

	/**
	 * @return the realPhoto
	 */
	public boolean isRealPhoto() {
		return realPhoto;
	}

	/**
	 * @param realPhoto
	 *            the realPhoto to set
	 */
	public void setRealPhoto(boolean realPhoto) {
		this.realPhoto = realPhoto;
	}

}

