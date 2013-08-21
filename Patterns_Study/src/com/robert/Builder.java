package com.robert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Media extends ArrayList{}
class Book extends Media{}
class Magazine extends Media{}
class WebSite extends Media{}

class MediaItem {
	private String s;
	public MediaItem(String s) {
		this.s = s;
	}
	public String toString() {
		return s;
	}
}

class Chapter extends MediaItem {
	public Chapter(String s) {
		super(s);
	}
}

class Article extends MediaItem {
	public Article(String s) {
		super(s);
	}
}

class WebItem extends MediaItem {
	public WebItem(String s) {
		super(s);
	}
}

//抽象建造者
class MediaBuilder {
	public void buildBase() {
		
	}
	
	public void addMediaItem(MediaItem item) {
		
	}
	
	public Media getFinishedMedia() {
		return null;
	}
}

class BookBuilder extends MediaBuilder{
	private Book b;
	public void buildBase() {
		System.out.println("Building book framework");
		b = new Book();
	}
	
	public void addMediaItem(MediaItem chapter) {
		System.out.println("Add chapter" + chapter);
		b.add(chapter);
	}
	
	public Media getFinishedMedia() {
		return b;
	}
}

class MagazineBuilder extends MediaBuilder{
	private Magazine m;
	public void buildBase() {
		System.out.println("Building magazine framework");
		m = new Magazine();
	}
	
	public void addMediaItem(MediaItem article) {
		System.out.println("Add article" + article);
		m.add(article);
	}
	
	public Media getFinishedMedia() {
		return m;
	}
}

class WebSiteeBuilder extends MediaBuilder{
	private WebSite w;
	public void buildBase() {
		System.out.println("Building web site framework");
		w = new WebSite();
	}
	
	public void addMediaItem(MediaItem webItem) {
		System.out.println("Add webItem" + webItem);
		w.add(webItem);
	}
	
	public Media getFinishedMedia() {
		return w;
	}
}

//指导者，也叫上下文
class MediaDirector {
	private MediaBuilder mb;
	public MediaDirector(MediaBuilder mb) {
		this.mb = mb;
	}
	public Media produceMedia(List input) {
		mb.buildBase();
		for (Iterator it = input.iterator();it.hasNext();) {
			mb.addMediaItem((MediaItem)it.next());
		}
		return mb.getFinishedMedia();
	}
}

public class Builder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
