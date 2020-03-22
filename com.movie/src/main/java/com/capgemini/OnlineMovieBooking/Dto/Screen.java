package com.capgemini.OnlineMovieBooking.Dto;

import java.util.List;
import java.util.regex.Pattern;

import javax.naming.LimitExceededException;


public class Screen {

	private Integer screenId;
	private Integer theatreId;
	private String screenName;
	private List<?> showList;
	private Integer rows;
	private Integer columns;
	
	public Screen() {
		// TODO Auto-generated constructor stub
	}
	
	public Screen(Integer screenId, Integer theatreId, String screenName,
			List<?> showList, Integer rows, Integer columns) {
		super();
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.screenName = screenName;
		this.showList = showList;
		this.rows = rows;
		this.columns = columns;
	}

	public List<?> getShowList() {
		return showList;
	}

	public void setShowList(List<?> showList) {
		this.showList = showList;
	}

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public Integer getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}

}
