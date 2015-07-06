package com.beachbody.data.transfer.to;

public class TrainerTO {
	
	private int trainer_id;
	private String trainerName;
	private String trainerClass;
	private String trainingProgramme;
	private String trainingCountry;
	private String trainingState;
	private String trainingCity;
	
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerClass() {
		return trainerClass;
	}
	public void setTrainerClass(String trainerClass) {
		this.trainerClass = trainerClass;
	}
	public String getTrainingProgramme() {
		return trainingProgramme;
	}
	public void setTrainingProgramme(String trainingProgramme) {
		this.trainingProgramme = trainingProgramme;
	}
	public String getTrainingCountry() {
		return trainingCountry;
	}
	public void setTrainingCountry(String trainingCountry) {
		this.trainingCountry = trainingCountry;
	}
	public String getTrainingState() {
		return trainingState;
	}
	public void setTrainingState(String trainingState) {
		this.trainingState = trainingState;
	}
	public String getTrainingCity() {
		return trainingCity;
	}
	public void setTrainingCity(String trainingCity) {
		this.trainingCity = trainingCity;
	}
	public int getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
}
