package com.zeynel.designpatterns.prototype;

public class BelgeTuru implements Cloneable{

    private Long id;
    private String ad;

    public BelgeTuru()
    {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "BelgeTuru{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                '}';
    }

    @Override
    protected BelgeTuru clone() throws CloneNotSupportedException {
        return (BelgeTuru) super.clone();
    }
}
