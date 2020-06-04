package com.hrorizen.chin;

import java.util.List;

public class ArraySort{


	public static void main(String[] args){
	
		int[] arr = new int[]{3,44,38,5,47,15,36,26,37,2,46,4,19,50,48};
	
		//for(int a : bubbleSort( arr ) ) System.out.println( a ) ;
		//for(int a : selectionSort( arr ) ) System.out.println( a ) ;
		for(int a : insertionSort( arr ) ) System.out.println( a ) ;
		System.out.println( 13&17 );

	}

	//冒泡排序
	private static int[] bubbleSort(int[] arr){
		/*
		* 1.重左至右循环，遇到比自自己大的数，交换数据，
		* 2.重复上面的步骤
		* */	
		for( int i = 0 ; i < arr.length - 1 ; i ++ ){
			for( int j = 0 ; j < arr.length - 1 - i ; j ++ ){
				if( arr[j] > arr[j+1] ) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
			}

		}	
		return arr;

	}

	//选择排序
	private static int[] selectionSort( int[] arr ){

		int minIndex ;
		for( int i = 0 ; i < arr.length - 1 ; i ++ ){
		
			minIndex = i ; 
			for( int j = i + 1 ; j < arr.length - 1; j ++ ){
				if( arr[minIndex] > arr[j] ){
					minIndex = j ;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}	

		return arr;
	}

	//插入排序
	private static int[] insertionSort( int[] arr ){
		
		
		for( int i = 1 ; i < arr.length ; i ++ ){
			int current = arr[i];
			int preIndex = i - 1 ;
			while( preIndex >= 0 && arr[preIndex] > current ){
				arr[preIndex+1] = arr[preIndex];
				preIndex --;
			}
			arr[preIndex + 1 ] = current;
		
		}	
		return arr;

	}






}





