package Commdodity.Run;

import java.sql.*;
import java.util.Scanner;
import java.io.Closeable;
import java.io.IOException;
import com.mysql.cj.xdevapi.Statement;

public class Run {
	 public static void main(String[] args) {
		 // 声明部分
	     int mc1;
	     Scanner sc = new Scanner(System.in);
	     boolean isRunning = true; // 循环控制变量

	     while (isRunning) {
	    	 // 绘制系统登录菜单
	         System.out.println("  商品管理系统");
	         System.out.println("================");
	         System.out.println("   1. 登录");
	         System.out.println("   0. 退出");
	         System.out.println("================");
	         System.out.print("输入菜单编号[1,0]：");
	         mc1 = sc.nextInt();
	         // 根据用户选择进行相应的操作
	         switch (mc1) {
	         	case 1 -> {
	         		// 调用登录系统方法
	                login();	                  
	            }
	            case 0 -> {
	                System.out.println("谢谢使用~再见~");
	                isRunning = false; // 结束循环
	            }
	            default -> System.out.println("输入的菜单编号有误!");
	         }
	     }
	 }
	 
	 private static void login() {    	
		 //登录系统方法
	     String username, password;
	     Scanner sc = new Scanner(System.in);

	     System.out.print("用户名:");
	     username = sc.next();
	     System.out.print("密  码:");
	     password = sc.next();

	     if (username.equals("root") && password.equals("1234")) {
	    	 System.out.println("登录成功~");
	    	 // 调用系统主菜单方法
	         MainMenu();
	     } else {
	    	 System.out.println("用户名或密码有误，登录失败~");
	     }
	 }
	 
	 private static void MainMenu() {
		 //系统主菜单方法
		 int mc2;
	     Scanner sc = new Scanner(System.in);
	     boolean isRunning = true; // 循环控制变量

	     while (isRunning) {
	            // 绘制系统二级菜单
	            System.out.println("=======系统主菜单========");
	            System.out.println("  1. 商品模块");
	            System.out.println("  2. 进货模块");
	            System.out.println("  3. 客户模块");
	            System.out.println("  4. 销售模块");
	            System.out.println("  5. 库存模块");
	            System.out.println("  6. 返回上级");
	            System.out.println("=======================");
	            System.out.print("输入菜单编号[1,2,3,4,5,6]:");
	            mc2 = sc.nextInt();

	            switch (mc2) {
	                case 1 -> {
	                	System.out.println();
	                    System.out.println("正在进入商品模块中...");
	                    System.out.println();
	                    GoodsMenu(); // 调用商品模块菜单方法
	                }
	                case 2 -> {
	                	System.out.println();
	                    System.out.println("正在进入进货模块中...");
	                    System.out.println();
	                    PurchaseMenu(); // 调用进货模块菜单方法
	                }
	                case 3 -> {
	                	System.out.println();
	                    System.out.println("正在进入客户模块中...");
	                    System.out.println();
	                    ClientMenu(); // 调用客户模块菜单方法
	                }
	                case 4 -> {
	                	System.out.println();
	                    System.out.println("正在进入销售模块中...");
	                    System.out.println();
	                    SaleMenu(); // 调用销售模块菜单方法
	                }
	                case 5 -> {
	                	System.out.println();
	                    System.out.println("正在进入库存模块中...");
	                    System.out.println();
	                    StockMenu(); // 调用库存模块菜单方法
	                }
	                case 6 -> isRunning = false; // 结束二级菜单循环
	                default -> System.out.println("输入的菜单编号有误!");
	            }
	        }
	    }
	 
	 private static void GoodsMenu() {
		 //商品模块菜单方法
		 int mc3;
	        Scanner sc = new Scanner(System.in);
	        boolean isRunning = true; // 循环控制变量

	        while (isRunning) {
	            // 绘制商品三级菜单
	            System.out.println("=======商品模块菜单========");
	            System.out.println("  1. 添加商品信息");
	            System.out.println("  2. 修改商品信息");
	            System.out.println("  3. 删除商品信息");
	            System.out.println("  4. 返回上级");
	            System.out.println("=======================");
	            System.out.print("输入菜单编号[1,2,3,4]:");
	            mc3 = sc.nextInt();

	            switch (mc3) {
	                case 1 -> {
	                	System.out.println();
	                    System.out.println("正在进入添加商品信息功能中...");
	                    System.out.println();
	                    AddGoods(); // 调用添加商品信息方法
	                }
	                case 2 -> {
	                	System.out.println();
	                    System.out.println("正在进入修改商品信息功能中...");
	                    System.out.println();
	                    FixGoods(); // 调用修改商品信息方法
	                }
	                case 3 -> {
	                	System.out.println();
	                    System.out.println("正在进入删除商品信息功能中...");
	                    System.out.println();
	                    DeleteGoods(); // 调用删除商品信息方法
	                }
	                case 4 -> isRunning = false; // 结束商品三级菜单循环
	                default -> System.out.println("输入的菜单编号有误!");
	            }
	        }
	    }
	 
		
	private static void PurchaseMenu() {
		//进货模块菜单方法
	 int mc4;
       Scanner sc = new Scanner(System.in);
       boolean isRunning = true; // 循环控制变量

       while (isRunning) {
           // 绘制进货三级菜单
           System.out.println("=======进货模块菜单========");
           System.out.println("  1. 添加进货信息");
           System.out.println("  2. 修改进货信息");
           System.out.println("  3. 删除进货信息");
           System.out.println("  4. 返回上级");
           System.out.println("=======================");
           System.out.print("输入菜单编号[1,2,3,4]:");
           mc4 = sc.nextInt();

           switch (mc4) {
               case 1 -> {
               	System.out.println();
                   System.out.println("正在进入添加进货信息功能中...");
                   System.out.println();
                   AddPurchase(); // 调用添加进货信息方法
               }
               case 2 -> {
               	System.out.println();
                   System.out.println("正在进入修改进货信息功能中...");
                   System.out.println();
                   FixPurchase(); // 调用修改进货信息方法
               }
               case 3 -> {
               	System.out.println();
                   System.out.println("正在进入删除进货信息功能中...");
                   System.out.println();
                   DeletePurchase(); // 调用删除进货信息方法
               }
               case 4 -> isRunning = false; // 结束进货三级菜单循环
               default -> System.out.println("输入的菜单编号有误!");
           }
       }
   }

	private static void ClientMenu() {//客户模块菜单方法
		 int mc5;
	       Scanner sc = new Scanner(System.in);
	       boolean isRunning = true; // 循环控制变量

	       while (isRunning) {
	           // 绘制客户三级菜单
	           System.out.println("=======客户模块菜单========");
	           System.out.println("  1. 添加客户信息");
	           System.out.println("  2. 修改客户信息");
	           System.out.println("  3. 删除客户信息");
	           System.out.println("  4. 返回上级");
	           System.out.println("=======================");
	           System.out.print("输入菜单编号[1,2,3,4]:");
	           mc5 = sc.nextInt();

	           switch (mc5) {
	               case 1 -> {
	               	System.out.println();
	                   System.out.println("正在进入添加客户信息功能中...");
	                   System.out.println();
	                   AddClient(); // 调用添加客户信息方法
	               }
	               case 2 -> {
	               	System.out.println();
	                   System.out.println("正在进入修改客户信息功能中...");
	                   System.out.println();
	                   FixClient(); // 调用修改客户信息方法
	               }
	               case 3 -> {
	               	System.out.println();
	                   System.out.println("正在进入删除客户信息功能中...");
	                   System.out.println();
	                   DeleteClient(); // 调用删除客户信息方法
	               }
	               case 4 -> isRunning = false; // 结束客户三级菜单循环
	               default -> System.out.println("输入的菜单编号有误!");
	           }
	       }
	   }
	
	
	private static void SaleMenu() {//销售模块菜单方法
		 int mc6;
	       Scanner sc = new Scanner(System.in);
	       boolean isRunning = true; // 循环控制变量

	       while (isRunning) {
	           // 绘制销售三级菜单
	           System.out.println("=======销售模块菜单========");
	           System.out.println("  1. 添加销售信息");
	           System.out.println("  2. 修改销售信息");
	           System.out.println("  3. 删除销售信息");
	           System.out.println("  4. 返回上级");
	           System.out.println("=======================");
	           System.out.print("输入菜单编号[1,2,3,4]:");
	           mc6 = sc.nextInt();

	           switch (mc6) {
	               case 1 -> {
	               	System.out.println();
	                   System.out.println("正在进入添加销售信息功能中...");
	                   System.out.println();
	                   AddSale(); // 调用添加销售信息方法
	               }
	               case 2 -> {
	               	System.out.println();
	                   System.out.println("正在进入修改销售信息功能中...");
	                   System.out.println();
	                   FixSale(); // 调用修改销售信息方法
	               }
	               case 3 -> {
	               	System.out.println();
	                   System.out.println("正在进入删除销售信息功能中...");
	                   System.out.println();
	                   DeleteSale(); // 调用删除销售信息方法
	               }
	               case 4 -> isRunning = false; // 结束销售三级菜单循环
	               default -> System.out.println("输入的菜单编号有误!");
	           }
	       }
	   }
	
	private static void StockMenu() {
		//库存模块菜单方法
		 int mc7;
	       Scanner sc = new Scanner(System.in);
	       boolean isRunning = true; // 循环控制变量

	       while (isRunning) {
	           // 绘制库存三级菜单
	           System.out.println("=======库存模块菜单========");
	           System.out.println("  1. 查询库存信息");
	           System.out.println("  2. 返回上级");
	           System.out.println("=======================");
	           System.out.print("输入菜单编号[1,2]:");
	           mc7 = sc.nextInt();

	           switch (mc7) {
	               case 1 -> {
	               	System.out.println();
	                   System.out.println("正在进入查询库存信息功能中...");
	                   System.out.println();
	                   StockMenuTwo();
	               }
	               case 2 -> isRunning = false; // 结束库存三级菜单循环
	               default -> System.out.println("输入的菜单编号有误!");
	           }
	       }
	   }
	
	private static void StockMenuTwo() {
		//库存模块二级菜单方法
		 int mc8;
	       Scanner sc = new Scanner(System.in);
	       boolean isRunning = true; // 循环控制变量

	       while (isRunning) {
	           // 绘制库存三级菜单
	           System.out.println("=======库存模块菜单========");
	           System.out.println("  1. 查询商品库存信息");
	           System.out.println("  2. 查询客户信息");
	           System.out.println("  3. 查询进货信息");
	           System.out.println("  4. 查询销售信息");
	           System.out.println("  5. 返回上级");
	           System.out.println("=======================");
	           System.out.print("输入菜单编号[1,2,3,4,5]:");
	           mc8 = sc.nextInt();

	           switch (mc8) {
	               case 1 -> {
	               	System.out.println();
	                   System.out.println("正在进入查询商品库存信息功能中...");
	                   System.out.println();
	                   CheckStockGoods();//查询商品库存信息方法
	               }
	               case 2 -> {
		               	System.out.println();
		                   System.out.println("正在进入查询客户信息功能中...");
		                   System.out.println();
		                   CheckStockClient();//查询客户信息信息方法
		               }
	               case 3 -> {
		               	System.out.println();
		                   System.out.println("正在进入查询进货信息功能中...");
		                   System.out.println();
		                   CheckStockPurchase();//查询进货信息信息方法
		               }
	               case 4 -> {
		               	System.out.println();
		                   System.out.println("正在进入查询销售信息功能中...");
		                   System.out.println();
		                   CheckStockSale();//查询销售信息信息方法
		               }
	               case 5 -> isRunning = false; // 结束库存三级菜单循环
	               default -> System.out.println("输入的菜单编号有误!");
	           }
	       }
	}
	
	
	private static void AddGoods() {
		//添加商品方法
		// 声明变量
		String Id;
		String Name;
		String Barcode;
		String Place;
        Scanner sc = new Scanner(System.in);
        Dbutil dbUtil=new Dbutil();
        // 输入商品信息
        System.out.print("请输入商品信息...\n");
        System.out.print("商品编号:");
        Id = sc.next();
        System.out.print("商品名称:");
        Name = sc.next();
        System.out.print("商品条码:");
        Barcode = sc.next();
        System.out.print("产地:");
        Place = sc.next();
        //插入商品信息的sql语句
        String sql="insert into goods values('"+Id+"','"+Name+"','"+Barcode+"','"+Place+"')";
        //调用Ubutil类来连接数据库并且执行相关sql语句的操作
        try {
        	Connection con=dbUtil.getCon();
        	java.sql.Statement stmt=con.createStatement();
        	int count=stmt.executeUpdate(sql);
        	//关闭资源
        	stmt.close();
        	dbUtil.closeCon(con);
        	System.out.println("数据库连接成功！");
        	System.out.println("已成功添加商品信息!\n");
        } catch (Exception e) {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        	System.out.println("数据库连接失败");
        	System.out.println("添加商品信息失败!\n");
        }
	}
	
	private static void FixGoods()  {
		//修改商品信息方法
		// 声明变量
				String Id;
				String Name;
				String Barcode;
				String Place;
				
		        Scanner sc = new Scanner(System.in);
		        
		        // 查询核对商品信息
		        System.out.print("输入要修改的商品编号:");
		        Id = sc.nextLine();

		        // 在数据库查询商品信息的sql语句
		        String sql1="select * from goods where Goods_id="+Id;
		        
		      //调用Ubutil类来连接数据库并且执行相关sql语句的操作
		        Dbutil dbUtil1=new Dbutil();
				try {
					Connection con1=dbUtil1.getCon();
			        java.sql.Statement stmt1=con1.createStatement();
			        ResultSet count1=stmt1.executeQuery(sql1);
			      //关闭资源
			        stmt1.close();
			        dbUtil1.closeCon(con1);
					System.out.println("数据库连接成功！\n");
					System.out.println("刻对信息成功！\n");
					System.out.println("可以继续执行操作...\n");
					//对要修改的商品信息进行相关输入
		        	System.out.println("请输入要修改的商品信息...\n");
		        	System.out.println("说明：输入“-”,表明不修改字段值");
		        	System.out.print("商品名称:");
		        	Name = sc.next();
		        	//根据每一个要修改的信息进行相关sql语句的修改
		        	if(!Name.equals("-")) {
		        		String sql2="Update goods set Goods_name='"+Name+"' where Goods_id='"+Id+"'";
		        		Dbutil dbUtil2=new Dbutil();
		        		try {
		        			Connection con2=dbUtil2.getCon();
		        	        java.sql.Statement stmt2=con2.createStatement();
		        	        int count2=stmt2.executeUpdate(sql2);
		        	        stmt2.close();
		        	        dbUtil2.closeCon(con2);
		        		} catch (Exception e) {
		        			// TODO Auto-generated catch block
		        			e.printStackTrace();
		        		}
		        	}
		        	System.out.print("商品条码:");
		        	Barcode = sc.next();
		        	if(!Barcode.equals("-")) {
		        		String sql3="Update goods set Goods_barcode='"+Barcode+"' where Goods_id='"+Id+"'";
		        		Dbutil dbUtil2=new Dbutil();
		        		try {
		        			Connection con2=dbUtil2.getCon();
		        	        java.sql.Statement stmt2=con2.createStatement();
		        	        int count2=stmt2.executeUpdate(sql3);
		        	        stmt2.close();
		        	        dbUtil2.closeCon(con2);
		        		} catch (Exception e) {
		        			// TODO Auto-generated catch block
		        			e.printStackTrace();
		        		}
		        	}
		        	System.out.print("产地:");
		        	Place = sc.next();
		        	if(!Place.equals("-")) {
		        		String sql4="Update goods set Production_place='"+Place+"' where Goods_id='"+Id+"'";
		        		Dbutil dbUtil2=new Dbutil();
		        		try {
		        			Connection con2=dbUtil2.getCon();
		        	        java.sql.Statement stmt2=con2.createStatement();
		        	        int count2=stmt2.executeUpdate(sql4);
		        	        stmt2.close();
		        	        dbUtil2.closeCon(con2);
		        		} catch (Exception e) {
		        			// TODO Auto-generated catch block
		        			e.printStackTrace();
		        		}
		        	}
		        	System.out.print("修改信息成功！\n");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("数据库连接失败\n");
					System.out.println("核对信息失败!\n");
				}
	}
	

	private static void DeleteGoods()  {
		//删除商品信息方法
		// 声明变量
				String Id;
		        Scanner sc = new Scanner(System.in);
		        
		        // 查询核对商品信息
		        System.out.print("输入要删除的商品编号:");
		        Id = sc.nextLine();
		        
		     // 在数据库查询商品信息的sql语句
		        String sql1="select * from goods where Goods_id='"+Id+"'";
		       
		      //调用Ubutil类来连接数据库并且执行相关sql语句的操作
		        Dbutil dbUtil1=new Dbutil();
				try {
					Connection con1=dbUtil1.getCon();
			        java.sql.Statement stmt1=con1.createStatement();
			        ResultSet count1=stmt1.executeQuery(sql1);
			      //关闭资源
			        stmt1.close();
			        dbUtil1.closeCon(con1);
					System.out.println("数据库连接成功！\n");
					System.out.println("刻对信息成功！\n");
					System.out.println("可以继续执行操作...\n");
					//再用删除的sql语句来删除相关的记录
					Dbutil dbUtil2=new Dbutil();
		    		try {
		    			String sql2="delete from goods where Goods_id='"+Id+"'";
		    			Connection con2=dbUtil2.getCon();
		    	        java.sql.Statement stmt2=con2.createStatement();
		    	        int count2=stmt2.executeUpdate(sql2);
		    	        stmt2.close();
		    	        dbUtil2.closeCon(con2);
		    		} catch (Exception e) {
		    			// TODO Auto-generated catch block
		    			e.printStackTrace();
		    		}
		    		System.out.print("删除信息成功！\n");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("数据库连接失败\n");
					System.out.println("核对信息失败!\n");
				}	
	}
	

	private static void CheckStockGoods()  {
		//商品库存的信息全查询方法
		// 声明变量
				String Id;
				boolean Result;
		    
		        // 在数据库查询全部商品信息的sql语句
		        String sql1="select * from goods";
		        
		      //调用Ubutil类来连接数据库并且执行相关sql语句的操作
		        Dbutil dbUtil1=new Dbutil();
				try {
					Connection con1=dbUtil1.getCon();
			        java.sql.Statement stmt1=con1.createStatement();
			        //用ResultSet和while循环语句来返回查询结果打印需要的全纪录
			        ResultSet count1=stmt1.executeQuery(sql1);
			        while(count1.next()) {
			        	String ID=count1.getString(1);
			    		String Name=count1.getString(2);
			    		String Barcode=count1.getString(3);
			    		String Place=count1.getString(4);
			    		System.out.println("Goods_id\\Goods_barcode\\Goods_name\\Production_place");
			    		System.out.println(ID+"\\"+Barcode+"\\"+Name+"\\"+Place);
			        }
			        //关闭资源
			        stmt1.close();
			        dbUtil1.closeCon(con1);
					System.out.println("数据库连接成功！\n");
					System.out.println("查询信息成功！\n");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("数据库连接失败\n");
					System.out.println("核对信息失败!\n");
				}	
	}
	
	private static void AddPurchase() {
		// 声明变量
		String PId;
		String GId;
		String Price;
		String Num;
		String Money;
		String Date;
		
		Scanner sc = new Scanner(System.in);
		        
		// 输入进货信息
		System.out.print("请输入进货商品信息...\n");
		System.out.print("进货编号:");
		PId = sc.next();
		System.out.print("商品编号:");
		GId = sc.next();
		System.out.print("进货单价:");
		Price = sc.next();
		System.out.print("进货数量:");
		Num = sc.next();
		System.out.print("进货金额:");
		Money = sc.next();
		System.out.print("进货日期:");
		Date = sc.next();
		
		String sql="insert into purchase values('"+PId+"','"+GId+"','"+Price+"','"+Num+"','"+Money+"','"+Date+"')";
		        
		Dbutil dbUtil=new Dbutil();
		try {
			Connection con=dbUtil.getCon();
	        java.sql.Statement stmt=con.createStatement();
	        int count=stmt.executeUpdate(sql);
	        stmt.close();
	        dbUtil.closeCon(con);
			System.out.println("数据库连接成功！\n");
			System.out.println("已成功添加进货商品信息!\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败\n");
			System.out.println("添加进货商品信息失败!\n");
		}
	}
	
	private static void FixPurchase()  {
		// 声明变量
		String PId;
		String GId;
		String Price;
		String Num;
		String Money;
		String Date;
		
        Scanner sc = new Scanner(System.in);
        
        // 查询核对商品信息
        
        System.out.print("输入要修改的进货编号:");
        PId = sc.nextLine();

        // 在数据库查询商品信息
        String sql1="select * from purchase where Purchase_id='"+PId+"'";
        
        
        Dbutil dbUtil1=new Dbutil();
		try {
			Connection con1=dbUtil1.getCon();
	        java.sql.Statement stmt1=con1.createStatement();
	        ResultSet count1=stmt1.executeQuery(sql1);
	        stmt1.close();
	        dbUtil1.closeCon(con1);
			System.out.println("数据库连接成功！\n");
			System.out.println("刻对信息成功！\n");
			System.out.println("可以继续执行操作...\n");
        	System.out.println("请输入要修改的商品信息...\n");
        	System.out.println("说明：输入“-”,表明不修改字段值\n");
        	System.out.print("商品编号:");
    		GId = sc.next();
        	if(!GId.equals("-")) {
        		String sql2="Update purchase set Goods_id='"+GId+"' where Purchase_id='"+PId+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql2);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
        	System.out.print("进货单价:");
    		Price = sc.next();
        	if(!Price.equals("-")) {
        		String sql3="Update purchase set Purchase_price='"+Price+"' where Purchase_id='"+PId+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql3);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
        	System.out.print("进货数量:");
    		Num = sc.next();
        	if(!Num.equals("-")) {
        		String sql4="Update purchase set Purchase_num='"+Num+"' where Purchase_id='"+PId+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql4);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
        	System.out.print("进货金额:");
    		Money = sc.next();
    		if(!Money.equals("-")) {
        		String sql4="Update purchase set Purchase_money='"+Money+"' where Purchase_id='"+PId+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql4);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
    		
    		System.out.print("进货日期:");
    		Date = sc.next();
    		if(!Date.equals("-")) {
        		String sql4="Update purchase set Purchase_date='"+Date+"' where Purchase_id='"+PId+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql4);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
        	System.out.print("修改信息成功！n");
        	System.exit(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败\n");
			System.out.println("核对信息失败!\n");
		}
	}
	
	private static void DeletePurchase()  {
		// 声明变量
		String PId;
        Scanner sc = new Scanner(System.in);
        
        // 查询核对商品信息
        
        System.out.print("输入要删除的进货商品编号:");
        PId = sc.nextLine();
        
     // 在数据库查询商品信息
        String sql1="select * from purchase where Purchase_id='"+PId+"'";
        
        
        Dbutil dbUtil1=new Dbutil();
		try {
			Connection con1=dbUtil1.getCon();
	        java.sql.Statement stmt1=con1.createStatement();
	        ResultSet count1=stmt1.executeQuery(sql1);
	        stmt1.close();
	        dbUtil1.closeCon(con1);
			System.out.println("数据库连接成功！\n");
			System.out.println("刻对信息成功！\n");
			System.out.println("可以继续执行操作...\n");
			Dbutil dbUtil2=new Dbutil();
    		try {
    			String sql2="delete from Purchase where PId='"+PId+"'";
    			Connection con2=dbUtil2.getCon();
    	        java.sql.Statement stmt2=con2.createStatement();
    	        int count2=stmt2.executeUpdate(sql2);
    	        stmt2.close();
    	        dbUtil2.closeCon(con2);
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		System.out.print("删除信息成功！\n");
        	System.exit(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败\n");
			System.out.println("核对信息失败!\n");
		}	
			
	}
	
	private static void AddClient() {
		// 声明变量
		String Id;
		String Name;
		String Mobile;
		String Address;
		String Email;
		
		Scanner sc = new Scanner(System.in);
		        
		// 输入进货信息
		System.out.print("请输入客户信息...\n");
		System.out.print("客户编号:");
		Id = sc.next();
		System.out.print("客户姓名:");
		Name = sc.next();
		System.out.print("联系电话:");
		Mobile = sc.next();
		System.out.print("地址:");
		Address = sc.next();
		System.out.print("邮箱:");
		Email = sc.next();
		
		
		String sql="insert into client values('"+Id+"','"+Name+"','"+Mobile+"','"+Address+"','"+Email+"')";
		        
		Dbutil dbUtil=new Dbutil();
		try {
			Connection con=dbUtil.getCon();
	        java.sql.Statement stmt=con.createStatement();
	        int count=stmt.executeUpdate(sql);
	        stmt.close();
	        dbUtil.closeCon(con);
			System.out.println("数据库连接成功！\n");
			System.out.println("已成功添加客人信息!\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败\n");
			System.out.println("添加客人信息失败!\n");
		}
	}
	
	private static void FixClient()  {
		// 声明变量
		String Id;
		String Name;
		String Mobile;
		String Address;
		String Email;
		
        Scanner sc = new Scanner(System.in);
        
        // 查询核对商品信息
        
        System.out.print("输入要修改的客人编号:");
        Id = sc.nextLine();

        // 在数据库查询商品信息
        String sql1="select * from client where Client_id='"+Id+"'";
        
        
        Dbutil dbUtil1=new Dbutil();
		try {
			Connection con1=dbUtil1.getCon();
	        java.sql.Statement stmt1=con1.createStatement();
	        ResultSet count1=stmt1.executeQuery(sql1);
	        stmt1.close();
	        dbUtil1.closeCon(con1);
			System.out.println("数据库连接成功！\n");
			System.out.println("刻对信息成功！\n");
			System.out.println("可以继续执行操作...\n");
        	System.out.println("请输入要修改的商品信息...\n");
        	System.out.println("说明：输入“-”,表明不修改字段值");
        	System.out.print("客户姓名:");
    		Name = sc.next();
        	if(!Name.equals("-")) {
        		String sql3="Update client set Client_name='"+Name+"' where Client_id='"+Id+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql3);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
        	System.out.print("联系电话:");
    		Mobile = sc.next();
        	if(!Mobile.equals("-")) {
        		String sql4="Update client set Mobile='"+Mobile+"' where Client_id='"+Id+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql4);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
        	System.out.print("地址:");
    		Address = sc.next();
    		if(!Address.equals("-")) {
        		String sql4="Update client set Address='"+Address+"' where Client_id='"+Id+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql4);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
    		
    		System.out.print("邮箱:");
    		Email = sc.next();
    		if(!Email.equals("-")) {
        		String sql4="Update client set Email='"+Email+"' where Client_id='"+Id+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql4);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
        	System.out.print("修改信息成功！\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败\n");
			System.out.println("核对信息失败!\n");
		}
	}
	
	private static void DeleteClient()  {
		// 声明变量
		String Id;
        Scanner sc = new Scanner(System.in);
        
        // 查询核对商品信息
        
        System.out.print("输入要删除的客人编号:");
        Id = sc.nextLine();
        
     // 在数据库查询商品信息
        String sql1="select * from client where Client_id='"+Id+"'";
        
        
        Dbutil dbUtil1=new Dbutil();
		try {
			Connection con1=dbUtil1.getCon();
	        java.sql.Statement stmt1=con1.createStatement();
	        ResultSet count1=stmt1.executeQuery(sql1);
	        stmt1.close();
	        dbUtil1.closeCon(con1);
			System.out.println("数据库连接成功！\n");
			System.out.println("刻对信息成功！\n");
			System.out.println("可以继续执行操作...\n");
			Dbutil dbUtil2=new Dbutil();
    		try {
    			String sql2="delete from client where Client_id='"+Id+"'";
    			Connection con2=dbUtil2.getCon();
    	        java.sql.Statement stmt2=con2.createStatement();
    	        int count2=stmt2.executeUpdate(sql2);
    	        stmt2.close();
    	        dbUtil2.closeCon(con2);
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		System.out.print("删除信息成功！\n");
        	System.exit(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败\n");
			System.out.println("核对信息失败!\n");
		}	
			
	}
	
	private static void AddSale() {
		// 声明变量
		String SId;
		String GId;
		String CId;
		String Price;
		String Num;
		String Sum;
		String Date;
		
		Scanner sc = new Scanner(System.in);
		        
		// 输入进货信息
		System.out.print("请输入销售信息...\n");
		System.out.print("销售编号:");
		SId = sc.next();
		System.out.print("商品编号:");
		GId = sc.next();
		System.out.print("客户编号:");
		CId = sc.next();
		System.out.print("销售单价:");
		Price = sc.next();
		System.out.print("销售数量:");
		Num = sc.next();
		System.out.print("销售金额:");
		Sum = sc.next();
		System.out.print("销售日期:");
		Date = sc.next();
		
		String sql="insert into sale values('"+SId+"','"+GId+"','"+CId+"','"+Price+"','"+Num+"','"+Sum+"','"+Date+"')";
		        
		Dbutil dbUtil=new Dbutil();
		try {
			Connection con=dbUtil.getCon();
	        java.sql.Statement stmt=con.createStatement();
	        int count=stmt.executeUpdate(sql);
	        stmt.close();
	        dbUtil.closeCon(con);
			System.out.println("数据库连接成功！\n");
			System.out.println("已成功添加客人信息!\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败\n");
			System.out.println("添加客人信息失败!\n");
		}
	}
	
	private static void FixSale()  {
		// 声明变量
		String SId;
		String GId;
		String CId;
		String Price;
		String Num;
		String Sum;
		String Date;
		
        Scanner sc = new Scanner(System.in);
        
        // 查询核对商品信息
        
        System.out.print("输入要修改的销售编号:");
        SId = sc.nextLine();

        // 在数据库查询商品信息
        String sql1="select * from sale where Sale_id='"+SId+"'";
        
        
        Dbutil dbUtil1=new Dbutil();
		try {
			Connection con1=dbUtil1.getCon();
	        java.sql.Statement stmt1=con1.createStatement();
	        ResultSet count1=stmt1.executeQuery(sql1);
	        stmt1.close();
	        dbUtil1.closeCon(con1);
			System.out.println("数据库连接成功！\n");
			System.out.println("刻对信息成功！\n");
			System.out.println("可以继续执行操作...\n");
        	System.out.println("请输入要修改的商品信息...\n");
        	System.out.println("说明：输入“-”,表明不修改字段值");
        	System.out.print("商品编号:");
    		GId = sc.next();
        	if(!GId.equals("-")) {
        		String sql3="Update sale set Goods_id='"+GId+"' where Sale_id='"+SId+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql3);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
        	System.out.print("客户编号:");
    		CId = sc.next();
        	if(!CId.equals("-")) {
        		String sql4="Update sale set Client_id='"+CId+"' where Sale_id='"+SId+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql4);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
        	System.out.print("销售单价:");
    		Price = sc.next();
    		if(!Price.equals("-")) {
        		String sql4="Update sale set Sale_price='"+Price+"' where Sale_id='"+SId+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql4);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
    		
    		System.out.print("销售数量:");
    		Num = sc.next();
    		if(!Num.equals("-")) {
        		String sql4="Update sale set Sale_num='"+Num+"' where Sale_id='"+SId+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql4);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
    		System.out.print("销售金额:");
    		Sum = sc.next();
    		if(!Sum.equals("-")) {
        		String sql4="Update sale set Sale_sum='"+Sum+"' where Sale_id='"+SId+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql4);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
    		System.out.print("销售日期:");
    		Date = sc.next();
    		if(!Date.equals("-")) {
        		String sql4="Update sale set Sale_date='"+Date+"' where Sale_id='"+SId+"'";
        		Dbutil dbUtil2=new Dbutil();
        		try {
        			Connection con2=dbUtil2.getCon();
        	        java.sql.Statement stmt2=con2.createStatement();
        	        int count2=stmt2.executeUpdate(sql4);
        	        stmt2.close();
        	        dbUtil2.closeCon(con2);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
        	System.out.print("修改信息成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败");
			System.out.println("核对信息失败!\n");
		}
	}
	
	private static void DeleteSale()  {
		// 声明变量
		String SId;
        Scanner sc = new Scanner(System.in);
        
        // 查询核对商品信息
        
        System.out.print("输入要删除的客人编号:");
        SId = sc.nextLine();
        
     // 在数据库查询商品信息
        String sql1="select * from sale where Sale_id='"+SId+"'";
        
        
        Dbutil dbUtil1=new Dbutil();
		try {
			Connection con1=dbUtil1.getCon();
	        java.sql.Statement stmt1=con1.createStatement();
	        ResultSet count1=stmt1.executeQuery(sql1);
	        stmt1.close();
	        dbUtil1.closeCon(con1);
			System.out.println("数据库连接成功！\n");
			System.out.println("刻对信息成功！\n");
			System.out.println("可以继续执行操作...\n");
			Dbutil dbUtil2=new Dbutil();
    		try {
    			String sql2="delete from sale where Sale_id='"+SId+"'";
    			Connection con2=dbUtil2.getCon();
    	        java.sql.Statement stmt2=con2.createStatement();
    	        int count2=stmt2.executeUpdate(sql2);
    	        stmt2.close();
    	        dbUtil2.closeCon(con2);
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		System.out.print("删除信息成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败");
			System.out.println("核对信息失败!\n");
		}		
	}
	
	private static void CheckStockClient()  {
		// 声明变量
		String Id;
		boolean Result;
    
        // 在数据库查询全部商品信息
        String sql1="select * from client";
        
        Dbutil dbUtil1=new Dbutil();
		try {
			Connection con1=dbUtil1.getCon();
	        java.sql.Statement stmt1=con1.createStatement();
	        ResultSet count1=stmt1.executeQuery(sql1);
	        while(count1.next()) {
	        	String ID=count1.getString(1);
	    		String Name=count1.getString(2);
	    		String Mobile=count1.getString(3);
	    		String Address=count1.getString(4);
	    		String Email=count1.getString(5);
	    		System.out.println("Client_id\\Client_name\\Mobile\\Address\\Email");
	    		System.out.println(ID+"\\"+Name+"\\"+Mobile+"\\"+Address+"\\"+Email);
	        }
	        stmt1.close();
	        dbUtil1.closeCon(con1);
			System.out.println("数据库连接成功！\n");
			System.out.println("查询信息成功！\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败");
			System.out.println("核对信息失败!\n");
		}	
	}
	
	private static void CheckStockPurchase()  {
		// 声明变量
		String Id;
		boolean Result;
    
        // 在数据库查询全部商品信息
        String sql1="select * from purchase";
        
        Dbutil dbUtil1=new Dbutil();
		try {
			Connection con1=dbUtil1.getCon();
	        java.sql.Statement stmt1=con1.createStatement();
	        ResultSet count1=stmt1.executeQuery(sql1);
	        while(count1.next()) {
	        	String PId=count1.getString(1);
	    		String GId=count1.getString(2);
	    		String Price=count1.getString(3);
	    		String Num=count1.getString(4);
	    		String Money=count1.getString(5);
	    		String Date=count1.getString(5);
	    		System.out.println("Purchase_id\\Goods_id\\Purchase_price\\Purchase_num\\Purchase_money\\Purchase_date");
	    		System.out.println(PId+"\\"+GId+"\\"+Price+"\\"+Num+"\\"+Money+"\\"+Date);
	        }
	        stmt1.close();
	        dbUtil1.closeCon(con1);
			System.out.println("数据库连接成功！\n");
			System.out.println("查询信息成功！\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败\n");
			System.out.println("核对信息失败!\n");
		}	
	}
	
	private static void CheckStockSale()  {
		// 声明变量
		String Id;
    
        // 在数据库查询全部商品信息
        String sql1="select * from sale";
        
        Dbutil dbUtil1=new Dbutil();
		try {
			Connection con1=dbUtil1.getCon();
	        java.sql.Statement stmt1=con1.createStatement();
	        ResultSet count1=stmt1.executeQuery(sql1);
	        while(count1.next()) {
	        	String SId=count1.getString(1);
	    		String GId=count1.getString(2);
	    		String CId=count1.getString(3);
	    		String Price=count1.getString(4);
	    		String Num=count1.getString(5);
	    		String Sum=count1.getString(5);
	    		String Date=count1.getString(5);;
	    		System.out.println("Sale_id\\Goods_id\\Client_id\\Sale_price\\Sale_num\\Sale_sum\\Sale_date");
	    		System.out.println(SId+"\\"+GId+"\\"+CId+"\\"+Price+"\\"+Num+"\\"+Sum+"\\"+Date);
	        }
	        stmt1.close();
	        dbUtil1.closeCon(con1);
			System.out.println("数据库连接成功！\n");
			System.out.println("查询信息成功！\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败\n");
			System.out.println("核对信息失败!\n");
		}	
	}
}

