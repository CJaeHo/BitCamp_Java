package day0318;

import java.util.Scanner;

public class Ex7ArrayPuzzle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] puzzle = new int[3][3];
		int line;
		String ans;
		while(true) {
			
			// 1~3 사이의 난수를 2차원 배열에 넣기
			for(int i=0;i<puzzle.length;i++) {
				for(int j=0;j<puzzle.length;j++) {
					puzzle[i][j]=(int)(Math.random()*3)+1;
				}
			}
			// 출력
			for(int i=0; i<puzzle.length; i++) {
				for(int j=0; j<puzzle.length; j++) {
					System.out.printf("%4d", puzzle[i][j]);
				}
				System.out.println();
			}
			line=0;
			// 비교
			for(int i=0;i<puzzle.length; i++) {
				// 가로방향
				if(puzzle[i][0] == puzzle[i][1] && puzzle[i][1] == puzzle[i][2] )
					line++;
				// 세로방향
				if(puzzle[0][i] == puzzle[1][i] && puzzle[1][i] == puzzle[2][i] )
					line++;

			}
			// 대각선 \
			if(puzzle[0][0] == puzzle[1][1] && puzzle[1][1] == puzzle[2][2] )
				line++;
			// 대각선 /
			if(puzzle[0][2] == puzzle[1][1] && puzzle[1][1] == puzzle[2][0] )
				line++;
			
			// 출력
			if(line==0)
				System.out.println("\t** 꽝!!! **");
			else
				System.out.println("\t** 빙고 "+line+"개 **");
			
			System.out.println();
			ans=sc.nextLine();
			if(ans.equalsIgnoreCase("q")) {
				System.out.println("** 게임 종료 !! **");
				break;
			}
		}

	}

}
