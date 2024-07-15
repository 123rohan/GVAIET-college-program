package com.collection.queue;

public class Mail implements Comparable<Mail>{

private String maildString;
private String priorityString;

public Mail(String maildString, String priorityString) {
	super();
	this.maildString = maildString;
	this.priorityString = priorityString;
}
public String getMaildString() {
	return maildString;
}
public void setMaildString(String maildString) {
	this.maildString = maildString;
}
public String getPriorityString() {
	return priorityString;
}
public void setPriorityString(String priorityString) {
	this.priorityString = priorityString;
}


@Override
public String toString() {
	return "Mail [maildString=" + maildString + ", priorityString=" + priorityString + "]";
}
@Override
public int compareTo(Mail o) {
return this.priorityString.toLowerCase()
		.compareTo(o.priorityString.toLowerCase());
}




	
}
