package modelo;

import java.util.ArrayList;
import java.util.List;

public class Stuff {

	private int id;
	private String name;
	private String studyPlan;
	private List<String> resume;
	private List <String> book;
	private List <String> file;
	private List <String> midterm; // (parcial)
	private List <String> finals;
	private List <String> practicalWork;
	private List <String> videoLink;
	
	public Stuff() {
		resume = new ArrayList<String>();
		book = new ArrayList<String>();
		file = new ArrayList<String>();
		midterm = new ArrayList<String>();
		finals = new ArrayList<String>();
		practicalWork = new ArrayList<String>();
		videoLink = new ArrayList<String>();
	}
	public Stuff(int id, String name, String studyPlan) {
		this.setId(id);
		this.setName(name);
		this.setStudyPlan(studyPlan);
		resume = new ArrayList<String>();
		book = new ArrayList<String>();
		file = new ArrayList<String>();
		midterm = new ArrayList<String>();
		finals = new ArrayList<String>();
		practicalWork = new ArrayList<String>();
		videoLink = new ArrayList<String>();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudyPlan() {
		return studyPlan;
	}
	public void setStudyPlan(String studyPlan) {
		this.studyPlan = studyPlan;
	}
	public List<String> getResume() {
		return resume;
	}
	public void setResume(List<String> resume) {
		this.resume = resume;
	}
	public List <String> getBook() {
		return book;
	}
	public void setBook(List <String> book) {
		this.book = book;
	}
	public List <String> getFile() {
		return file;
	}
	public void setFile(List <String> file) {
		this.file = file;
	}
	public List <String> getMidterm() {
		return midterm;
	}
	public void setMidterm(List <String> midterm) {
		this.midterm = midterm;
	}
	public List <String> getFinals() {
		return finals;
	}
	public void setFinals(List <String> finals) {
		this.finals = finals;
	}
	public List <String> getPracticalWork() {
		return practicalWork;
	}
	public void setPracticalWork(List <String> practicalWork) {
		this.practicalWork = practicalWork;
	}
	public List <String> getVideoLink() {
		return videoLink;
	}
	public void setVideoLink(List <String> videoLink) {
		this.videoLink = videoLink;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
