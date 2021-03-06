package no.schedule.javazone.v3.io.model;

import java.io.Serializable;

public class Feedback implements Serializable {
  private int overall;
  private int relevance;
  private int content;
  private int quality;
  private String comments;

  public Feedback(int overall, int relevance, int content, int quality, String comment) {
    this.overall = overall;
    this.relevance = relevance;
    this.content = content;
    this.quality = quality;
    this.comments = comment;
  }

  public int getOverall() {
    return overall;
  }

  public void setOverall(int overall) {
    this.overall = overall;
  }

  public int getRelevance() {
    return relevance;
  }

  public void setRelevance(int relevance) {
    this.relevance = relevance;
  }

  public int getContent() {
    return content;
  }

  public void setContent(int content) {
    this.content = content;
  }

  public int getQuality() {
    return quality;
  }

  public void setQuality(int quality) {
    this.quality = quality;
  }

  public String getComments() { return comments; }

  public void setComments(String f) {
    this.comments = f;
  }
}