package application.model;

import java.time.LocalDate;

public class Measurements {
	private LocalDate date;
	private Double arms;
	private Double neck;
	private Double chest;
	private Double waist;
	private Double lowerwaist;
	private Double hips;
	private Double thighs;
	private Double calves;

	public Measurements(LocalDate date, Double arms, Double neck, Double chest, Double waist, Double lowerwaist,
			Double hips, Double thighs, Double calves) {
		this.date = date;
		this.arms = arms;
		this.neck = neck;
		this.chest = chest;
		this.waist = waist;
		this.lowerwaist = lowerwaist;
		this.hips = hips;
		this.thighs = thighs;
		this.calves = calves;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getArms() {
		return arms;
	}

	public void setArms(Double arms) {
		if(arms < 0) {
			System.out.println("arms can't be less than 0");
		}
		else {
			this.arms = arms;
		}
		
	}

	public Double getNeck() {
		return neck;
	}

	public void setNeck(Double neck) {
		if(neck < 0) {
			System.out.println("neck can't be less than 0");
		}
		else {
			this.neck = neck;
		}
		
	}

	public Double getChest() {
		return chest;
	}

	public void setChest(Double chest) {
		if(chest < 0) {
			System.out.println("chest can't be less than 0");
		}
		else{
			this.chest = chest;
		}
	}

	public Double getWaist() {
		return waist;
	}

	public void setWaist(Double waist) {
		if(waist < 0) {
			System.out.println("waist can't be less than 0");
		}
		else{
			this.waist = waist;
		}
	}

	public Double getLowerwaist() {
		return lowerwaist;
	}

	public void setLowerwaist(Double lowerwaist) {
		if(lowerwaist < 0) {
			System.out.println("lowerwaist can't be less than 0");
		}
		else{
			this.lowerwaist = lowerwaist;
		}
	}

	public Double getHips() {
		return hips;
	}

	public void setHips(Double hips) {
		if(hips < 0) {
			System.out.println("hips can't be less than 0");
		}
		else{
			this.hips = hips;
		}
	}

	public Double getThighs() {
		return thighs;
	}

	public void setThighs(Double thighs) {
		if(thighs < 0) {
			System.out.println("thights can't be less than 0");
		}
		else{
			this.thighs = thighs;
		}
	}

	public Double getCalves() {
		return calves;
	}

	public void setCalves(Double calves) {
		if(calves < 0) {
			System.out.println("calves can't be less than 0");
		}
		else{
			this.calves = calves;
		}
	}

}
