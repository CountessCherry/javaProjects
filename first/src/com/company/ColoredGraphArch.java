package com.company;

public class ColoredGraphArch extends GraphArch {
        private boolean colored;

        public ColoredGraphArch(int number, int length, GraphPoint start, GraphPoint end) {
            super(number,length,start,end);
        }

        public ColoredGraphArch() {
            super();
        }

        public GraphPoint goInStraightOrder() {
            colored = true;
            return super.goInStraightOrder();
        }

        public GraphPoint goInReversalOrder() {
            colored = false;
            return super.goInReverseOrder();
        }
}
