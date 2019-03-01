/**
 * This is for detect when the player got hit
 * 
 */
package edu.battleship.modele;

public class PaireAcepted extends Paire {

 private boolean hit;
 
 public boolean isHit() {
  return hit;
 }

 public void setHit(boolean hit) {
  this.hit = hit;
 }

 public PaireAcepted() {
  // TODO Auto-generated constructor stub
 }

 public PaireAcepted(int x, int y, boolean hit) {
  super(x, y);
  this.hit = hit;
 }

}
