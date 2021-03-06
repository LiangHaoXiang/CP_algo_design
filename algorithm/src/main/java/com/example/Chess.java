package com.example;

/**
 * Created by Wilber
 * on 2017/10/13.
 * 函数calc计算围棋盘位置(x,y)处的棋子还有多少口气。
 * 某个位置处的棋子还有多少口气的计算方法(简化计算)：从该位置出发，向四个方向遍历，
 * 允许拐弯，但不允许走斜线。如果遇到边线和对方棋子，则认为不能继续往前走。遍历完
 * 成后统计遍历过程中遇到的未落子的位置个数，该位置个数即出发点棋子的气的数目。
 * <p>
 * enum color {
 * NONE, WHITE, BLACK,         // 棋子颜色，NONE表示未落子
 * };
 * struct weiqi {
 * enum color board[19][19];   // 棋盘上每个位置的落子
 * };
 * int calc(struct weiqi *wq, int x, int y)
 * {
 * }
 * <p>
 * 输入描述:
 * 第1-19行数据是棋盘上棋子的颜色数据。0表示未落子，1表示白子，2表示黑子。
 * 第1行最左边位置的坐标是(0,0)，第1行第2列的坐标是(1,0)，第2行第1列的坐标是(0,1)，
 * 依此类推。 第20行数据是起始坐标(x,y)
 * 输出描述:
 * 位置(x,y)处的棋子还有多少口气，如果该位置未落子，则输出-1
 * 示例1
 * 输入
 * <p>
 * 0000000000000000000
 * 0000011000000000000
 * 0000001111000000000
 * 0000001021000000000
 * 0000001110100000000
 * 0000000000000000000
 * 0000000000000000000
 * 0000000000000000000
 * 0000000000000000000
 * 0000000000000000000
 * 0000000000000000000
 * 0000000000000000000
 * 0000000000000000000
 * 0000000000000000000
 * 0000000000000000000
 * 0000000000000000000
 * 0000000000000000000
 * 0000000000000000000
 * 0000000000000000000
 * 8,3
 * 输出
 * <p>
 * 1
 * 说明
 * <p>
 * 位置(8,3)处的棋子是黑色，还有1口气
 */

public class Chess {
    public static void main(String[] args) {

    }
}
