import acm.graphics.GCompound;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;

import java.awt.*;

public class Man extends GCompound {


    int Parts = 0;

    GOval head = new GOval(40, 40);
    GLine body = new GLine(head.getX() + head.getWidth() / 2, head.getY() + head.getHeight(), head.getX() + head.getWidth() / 2, head.getY() + head.getHeight() + 40);
    GLine LArm = new GLine(body.getStartPoint().getX(), body.getStartPoint().getY(), body.getStartPoint().getX() - 20, body.getStartPoint().getY() + 20);
    GLine RArm = new GLine(body.getStartPoint().getX(), body.getStartPoint().getY(), body.getStartPoint().getX() + 20, body.getStartPoint().getY() + 20);
    GLine LLeg = new GLine(body.getEndPoint().getX(), body.getEndPoint().getY(), body.getEndPoint().getX() - 20, body.getEndPoint().getY() + 20);
    GLine RLeg = new GLine(body.getEndPoint().getX(), body.getEndPoint().getY(), body.getEndPoint().getX() + 20, body.getEndPoint().getY() + 20);

    static GRect base =  new GRect(200, 15);
    static GRect stem = new GRect(15, 200);
    static GRect beam = new GRect(100, 15);
    static GRect noose = new GRect(2, 20);

    public static double[] drawPoint = {noose.getX(), noose.getY() + noose.getHeight()};

    public void addGallows(int startPosX, int startPosY){
        add(base, startPosX, startPosY);
        add(stem, base.getX() + base.getWidth() / 2 - stem.getWidth() / 2, startPosY - stem.getHeight());
        add(beam, stem.getX() + stem.getWidth(), stem.getY());
        add(noose, beam.getX() + beam.getWidth() - stem.getWidth(), stem.getY() + beam.getHeight());

        base.setFillColor(Color.black);
        base.setFilled(true);

       stem.setFillColor(Color.black);
       stem.setFilled(true);

       beam.setFillColor(Color.black);
       beam.setFilled(true);

       noose.setFillColor(Color.black);
       noose.setFilled(true);
    }



    public Man() {

        head.setVisible(false);
        body.setVisible(false);
        LArm.setVisible(false);
        RArm.setVisible(false);
        LLeg.setVisible(false);
        RLeg.setVisible(false);


        GCompound man = new GCompound();
        man.add(head);
        man.add(body);
        man.add(LArm);
        man.add(RArm);
        man.add(LLeg);
        man.add(RLeg);

        add(man);
    }

    public void addParts() {
        this.Parts += 1;
        switch (Parts) {
            case 1:
                this.head.setVisible(true);
                break;

            case 2:
                this.body.setVisible(true);
                break;
            case 3:
                this.LArm.setVisible(true);
                break;
            case 4:
                this.RArm.setVisible(true);
                break;
            case 5:
                this.LLeg.setVisible(true);
                break;
            case 6:
                this.RLeg.setVisible(true);
        }
    }
}