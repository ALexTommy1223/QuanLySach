package com.example.quanlysach.model;

public class Sach {
   private int masach;
   private String tensach;
   private int giathue;
   private int maloai;
   public Sach(){

   }
   public Sach(int masach, String tensach, int giathue, int maloai) {
      this.masach = masach;
      this.tensach = tensach;
      this.giathue = giathue;
      this.maloai = maloai;
   }

   public int getMasach() {
      return masach;
   }

   public void setMasach(int masach) {
      this.masach = masach;
   }

   public String getTensach() {
      return tensach;
   }

   public void setTensach(String tensach) {
      this.tensach = tensach;
   }

   public int getGiathue() {
      return giathue;
   }

   public void setGiathue(int giathue) {
      this.giathue = giathue;
   }

   public int getMaloai() {
      return maloai;
   }

   public void setMaloai(int maloai) {
      this.maloai = maloai;
   }
}
