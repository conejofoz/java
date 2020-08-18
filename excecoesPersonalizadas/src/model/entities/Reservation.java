package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	private Integer rootNumber;
	private Date checkIn;
	private Date checkOut;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Reservation(Integer rootNumber, Date checkIn, Date checkOut) throws DomainException {
		
		if (!checkOut.after(checkIn)) {
			  throw new DomainException("Check-out date must be after check-in date");
			}
		
		this.rootNumber = rootNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
	}


	public Integer getRootNumber() {
		return rootNumber;
	}


	public void setRootNumber(Integer rootNumber) {
		this.rootNumber = rootNumber;
	}


	public Date getCheckIn() {
		return checkIn;
	}


	/*
	 * public void setCheckIn(Date checkIn) { this.checkIn = checkIn; }
	 */


	public Date getCheckOut() {
		return checkOut;
	}


	/*
	 * public void setCheckOut(Date checkOut) { this.checkOut = checkOut; }
	 */
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates ");
		} 
		
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		
	}
	
	@Override
	public String toString() {
		return "Room "
				+ rootNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}
	
	
}
