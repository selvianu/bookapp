package model;

public class Book {
	private long id;
	private String name;
	private Integer cost;
	private String publication;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", cost=" + cost
				+ ", publication=" + publication + "]";
	}

	
}
