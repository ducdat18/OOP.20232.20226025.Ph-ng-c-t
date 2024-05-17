package hust.soict.globalict.aims.media;

import java.util.Comparator;

import hust.soict.globalict.aims.media.MediaComparatorByCostTitle;
import hust.soict.globalict.aims.media.MediaComparatorByTitleCost;

public abstract class Media {
	private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST1 = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE1 = new MediaComparatorByCostTitle();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    // isMatch method
    public boolean isMatch(String title){
        return this.getTitle().equals(title);
    }
    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        Media other = (Media) obj;
        if (this.getTitle() == null){
            return other.getTitle() == null;
        } else return title.equals(other.title);
    }

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

public int compareTo(Media other) {
    int titleComparison = this.getTitle().compareTo(other.getTitle());
    if (titleComparison != 0) {
        return titleComparison;
    } else {
        return Double.compare(this.getCost(), other.getCost());
    }
}
}
