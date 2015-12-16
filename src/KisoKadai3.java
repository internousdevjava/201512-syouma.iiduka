import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KisoKadai3
{
	public static void main(String[] args)
	{
		System.out.println("メニュー");
		while(true)										//ループ開始
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1=ファイルを読み込む");
			System.out.println("2=ファイルの削除");
			System.out.println("3=終了");

			try											//例外処理
			{
				String m = br.readLine();
				int n = Integer.parseInt(m);
				switch(n)
				{
				case 1:

					try{								//例外処理
						System.out.println("ファイルを読み込みます。");
						BufferedReader na = new BufferedReader(new InputStreamReader(System.in));
						System.out.println("読み込むファイルを指定してください。");
						System.out.print("c:\\");
						String name = "c:\\" + na.readLine();
						File file = new File(name);

						if(file.exists())				//ファイルの存在確認
						{
							if(file.isFile() && file.canRead())
							{
								System.out.println("ファイルの存在を確認しました。");
							while(true)
							{
									System.out.println("本日は何をしますか？");
									System.out.println("1=読み込んだ内容を出力");
									System.out.println("2=ファイルに書き込み/上書き");
									System.out.println("3=ファイルに追記");
									System.out.println("4=ファイルの指定に戻る");


									BufferedReader ma2 = new BufferedReader(new InputStreamReader(System.in));
									String make2 = ma2.readLine();
									int ke2 = Integer.parseInt(make2);


									switch(ke2)					//作成選択肢
									{
									case 1:
										System.out.println("読み込んだ内容を出力します");
										System.out.println("-------------------------------------------------始まり");
										BufferedReader ch = new BufferedReader(new FileReader(file));

										String str = ch.readLine();

										while ( str != null)
										{
											System.out.println(str);

											str = ch.readLine();
										}
										ch.close();
										System.out.println("-------------------------------------------------終わり");
										continue;
									case 2:
										System.out.println("ファイルに書き込み/上書きします");
										System.out.println("[/end]と入力すると終了するよ！");
										System.out.println("-------------------------------------------------始まり");
										PrintWriter bw =new PrintWriter (new BufferedWriter(new FileWriter(file,false)));

										while(true){
										BufferedReader kaki = new BufferedReader(new InputStreamReader(System.in));
										String kaki2 = kaki.readLine();
											if(kaki2.equals("/end")){
												System.out.println("-------------------------------------------------終わり");
												break;
											}

										bw.println(kaki2);
										}

										bw.close();

										continue;


									case 3:
										System.out.println("ファイルに追記");
										System.out.println("[/end]と入力すると終了するよ！");
										System.out.println("-------------------------------------------------始まり");


										BufferedReader ln = new BufferedReader(new FileReader(file));

										String stri = ln.readLine();

										while ( stri != null)
										{
											System.out.println(stri);

											stri = ln.readLine();
										}
										ln.close();



										PrintWriter pw =new PrintWriter (new BufferedWriter(new FileWriter(file,true)));

										while(true){
										BufferedReader pri = new BufferedReader(new InputStreamReader(System.in));
										String pri2 = pri.readLine();

										if(pri2.equals("/end")){
												System.out.println("-------------------------------------------------終わり");
												break;
											}

										pw.println(pri2);
										}

										pw.close();

										continue;
									case 4:
										System.out.println("ファイル選択に戻ります。");
										System.out.println("さよならー");

										break;
									}
									break;
								}continue;
							}
							else
							{
								System.out.println("メニューに戻ります！");
								continue;
							}
							}else							//ない場合の作成確認
							{
								System.out.println("ファイルの存在を確認できません。");
								System.out.println("ディレクトリを指定した可能性があります。");
								System.out.println("ファイルorフォルダを作成しますか？1=yes 2=no");
								BufferedReader ma = new BufferedReader(new InputStreamReader(System.in));
								String make = ma.readLine();
								int ke = Integer.parseInt(make);
								switch(ke)					//作成選択肢
								{
							case 1:						//作成する場合



								System.out.println("どちらを作成しますか？1=ファイル 2=ディレクトリ");
								BufferedReader mk = new BufferedReader(new InputStreamReader(System.in));
								String mkk = mk.readLine();
								int mkkk = Integer.parseInt(mkk);
								switch(mkkk)				//どっちを作るかの選択肢
								{
								case 1:						//ファイルの作成
									if( file.createNewFile())
									{
										System.out.println("ファイルの作成に成功しました。");
									}else
									{
										System.out.println("ファイルの作成に失敗しました。");
									}
									break;



								case 2:						//ディレクトリの作成
									if( file.mkdir())
									{
										System.out.println("ディレクトリの作成に成功しました。");
									}else
									{
										System.out.println("同じディレクトリが存在します！");
									}
									break;
								}


							case 2:
								System.out.println("そのファイルは読み込めません。");
								System.out.println("メニューに戻ります。");
								continue;
							}
							if( ke == 2){					//脱出路
								break;
							}
						}
					}catch(FileNotFoundException e){		//おまじない
					}
				case 2:
					System.out.println("削除するファイル/ディレクトリを指定してください。（中身がある場合はできません）");
					BufferedReader ri = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("c:\\");
					String riname = "c:\\" + ri.readLine();
					File rifile = new File(riname);

					if(rifile.exists()){
						System.out.println("ファイルを削除してよろしいでしょうか？ 1=yes 2=no");
						BufferedReader de = new BufferedReader(new InputStreamReader(System.in));
						String dee = de.readLine();
						int deee = Integer.parseInt(dee);
						if(deee == 1){

							if( rifile.delete()){
								System.out.println("ファイルを削除しました。");
							}else{
								System.out.println("ファイルの削除に失敗しました。");
							}

							continue;

						}else{
							break;
						}
					}else{
						System.out.println("ファイルが見つかりません。");
						continue;
					}



				case 3:System.out.println("終了します。");
				System.exit(0);								//終了宣言


				default:System.err.println("１～２までの数字で入力してください。");
				}


			}catch(IOException e){							//おまじない
				System.err.println("このディレクトリは指定できないか、[.txt]になっていません。");
			}catch(NumberFormatException e){				//おまじない
				System.err.println("数字を入れてください！！");
			}
		}
	}
}
