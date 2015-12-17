import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KisoKadai1 {
	public static void main(String[] args) {
		System.out.println("指定された範囲の九九表を出力します。");

		while(true){
		try{
			System.out.println("一つ目の数字を指定してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		int xt =Integer.parseInt(str);

		System.out.println("二つ目の数字を指定してください。");
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String str2= br2.readLine();
		int yt =Integer.parseInt(str2);

			int max = 10000;
			int x = xt;
			int y = yt;

			if( x * y  <= max)
			{
				if( x * y != 0){
				for(int i = 1 ; i <= x ; i++ )
				{
					for(int k = 1 ; k <= y ; k++)
					{
						System.out.print( i * k + " ");
					}
					System.out.println("");
				}
				}else{
					System.out.println("0は入力できません。");

				}}else{
					System.out.println( max + "以上は計算できません。");

				}


			while(true){
			try{
			System.out.println("もう一度やりますか？1=yse 2=no");
			BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
			String str3= br3.readLine();
			int q =Integer.parseInt(str3);

			if(q==2){
				System.out.println("九九表を終了します。");
				System.exit(0);
			}else if(q==1){
				break;
			}else{
				System.out.println("1か2で入力してください。");
			}
			}catch(IOException e){
			}catch(NumberFormatException e){
				System.out.println("数字で入力してください。");
			}
			}




		}catch(IOException e){
		}catch(NumberFormatException e){
			System.out.println("数字で入力してください。");
		}
		}

	}
}

