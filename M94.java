package ru.mirea.pr2;

public class M94 {
        private double X = 0.0, Y = 0.0;

        public M94(double x,double y)
        {
            double X=x;
            double Y=y;
        }

        public double getX() {
            return X;
        }

        public double getY() {
            return Y;
        }

        public void setX(double x) {
            X = x;
        }

        public void setY(double y) {
            Y = y;
        }

        public void setXY(double x,double y)
        {
            this.X=x;
            this.Y=y;
        }

        public void move(double xDisp,double yDisp)
        {
            X+=xDisp;
            Y+=yDisp;
        }

        @Override
        public String toString() {
            return "Ball{" + "X=" + X + ", Y=" + Y + '}';
        }
    }

