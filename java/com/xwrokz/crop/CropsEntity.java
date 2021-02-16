package com.xwrokz.crop;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xwrokz.crop.constants.CropSeason;
import com.xwrokz.crop.constants.CropType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@RequiredArgsConstructor

@Entity
@Table(name="crops")
public class CropsEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CID")
	private int cId;
	
	@Column(name="CROP_NAME")
	private String cropName;
	
	@Column(name="CROP_PRICE")
	private double cropPrice;
	
	@Column(name="ORGANIC")
	private boolean organic;
	
	@Column(name="LIFE")
	private int life;
	
	@Column(name="SEASON")
	private CropSeason season;
	
	@Column(name="TYPE")
	private CropType type;
	
	public CropsEntity(String cropName, double cropPrice, boolean organic, int life, CropSeason season, CropType type) {
		super();
		this.cropName = cropName;
		this.cropPrice = cropPrice;
		this.organic = organic;
		this.life = life;
		this.season = season;
		this.type = type;
	}
	
	
	
	

}
