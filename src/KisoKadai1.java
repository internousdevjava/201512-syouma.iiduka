public class KisoKadai1 {
	public static void main(String[] args) {
		System.out.println("指定された範囲の九九表を出力します。");

			int max = 100;
			int x = 9;
			int y = 9;

			if( x  <= max)
			{
				if( y <= max){
				for(int i = 1 ; i <= x ; i++ )
				{
					for(int k = 1 ; k <= y ; k++)
					{
						System.out.print( i * k + " ");
					}
					System.out.println("");
				}
				}
				else{
					System.out.println( max + "以上は計算できません。");
				}
			}
			else
			{
				System.out.println( max + "以上は計算できません。");
			}
		}
	}
