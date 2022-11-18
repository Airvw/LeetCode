class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int answer = 0;
        answer += getArea(ax2 - ax1, ay2 - ay1) + getArea(bx2 - bx1, by2 - by1);
        int x = checkX(ax1, ax2, bx1, bx2);
        int y = checkY(ay1, ay2, by1, by2);
        answer -= getArea(x, y);
        return answer;
    }

    private int checkY(int ay1, int ay2, int by1, int by2) {
        int diff = Math.min(ay2, by2) - Math.max(ay1, by1);
        if(diff <= 0) return 0;
        return diff;
    }

    private int checkX(int ax1, int ax2, int bx1, int bx2) {
        int diff = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        if(diff <= 0)
            return 0;
        return diff;
    }

    private int getArea(int x, int y ){
        return x * y;
    }
}