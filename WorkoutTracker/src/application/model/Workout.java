package application.model;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Workout {

	private LocalDate date;
	private String exercise;
	private int sets;
	private int reps;
	private int weight;

	public Workout(LocalDate date, String exercise, int sets, int reps, int weight) {
		this.date = date;
		this.exercise = exercise;
		this.sets = sets;
		this.reps = reps;
		this.weight = weight;
	}

	public String getDayOfWeek() {
		return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
	}

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		if (sets < 0) {
			System.out.println("Sets can't be less than 0");
		} else {
			this.sets = sets;
		}
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		if (reps < 0) {
			System.out.println("Reps can't be less than 0");
		} else {
			this.reps = reps;
		}
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight < 0) {
			System.out.println("weight can't be less than 0");
		} else {
			this.weight = weight;
		}
	}

	@Override
	public String toString() {
		return "Workout: " + date + ", " + getDayOfWeek() + ": " + exercise + " " + sets + "x" + reps + ", " + weight + "kg.";
	}

}
