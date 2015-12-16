import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class KisoKadai2
{
	public static void main(String[] args)
	{
		System.out.println("数字当てゲーム！ランダムに決まる数字を当てようっ！");

		while(true)
		{

			Random rnd = new Random();
			int ran = rnd.nextInt(100);
			int a = 0;
			int i = 1;
			while(true)
			{
				System.out.println("数字で入力してね！101でギブアップ");
				System.out.println("・" + i + "回目!");
				try
				{
					BufferedReader s = new BufferedReader(new InputStreamReader( System.in ));
					String w = s.readLine();
					int e = Integer.parseInt(w);


				if ( ran == e )
				{
					System.out.println(i + "回目で正解！おめでとう！" + "\n" );
					break;
				}else if( e == 101)
				{
					System.out.println("ギブアップ！");
					break;
				}else if(e > 100)
				{
					System.err.println("100以下で入力してください。");
					continue;
				}else if( ran > e )
				{
					System.out.println("もっと大きいよ");
				}else if( ran < e )
				{
					System.out.println("もっと小さいよ");
				}
				i++;
			}catch(IOException e){
				System.err.println("100以下の数字で入力してください。");
				continue;
			}catch(NumberFormatException e){
				System.err.println("100以下の数字で入力してください。");
				continue;
			}}

			while(true){
				System.out.println("もう一度やりますか？ 1=yes 2=no");
				try{
					BufferedReader s = new BufferedReader(new InputStreamReader( System.in ) );
					String l = s.readLine();
					a = Integer.parseInt(l);

				{}
				if( a == 2)
				{
					System.out.println("High&Lowを終了します。");
					break;
				}else if( a == 1 )
				{
					System.out.println("もう一度開始します。");
					break;
				}else
				{
					System.err.println("1か2で入力してください。");
				}
			}catch(IOException e ){

			}catch(NumberFormatException e){
				System.out.println("数字で入力してください");
			}
			}
			if( a == 2){
				break;
			}
		}
	}
}

