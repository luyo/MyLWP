package luyo.soesintthu.LWP;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Handler;
import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;

public class MyCustomLWPServices extends WallpaperService {

	private Bitmap[] bitmaps;


	public MyCustomLWPServices(){
		Bitmap[] bitmaps = new Bitmap[49];
		this.bitmaps = bitmaps;
	}
	
	public void setBitMaps(){
		Runtime.getRuntime().gc();
		try{
			Bitmap bm01 = BitmapFactory.decodeResource(getResources(), R.drawable.n01);
			bitmaps[0] = bm01;
			Bitmap bm02 = BitmapFactory.decodeResource(getResources(), R.drawable.n02);
			bitmaps[1] = bm02;
			Bitmap bm03 = BitmapFactory.decodeResource(getResources(), R.drawable.n03);
			bitmaps[2] = bm03;
			Bitmap bm04 = BitmapFactory.decodeResource(getResources(), R.drawable.n04);
			bitmaps[3] = bm04;
			Bitmap bm05 = BitmapFactory.decodeResource(getResources(), R.drawable.n05);
			bitmaps[4] = bm05;
			Bitmap bm06 = BitmapFactory.decodeResource(getResources(), R.drawable.n06);
			bitmaps[5] = bm06;
			Bitmap bm07 = BitmapFactory.decodeResource(getResources(), R.drawable.n07);
			bitmaps[6] = bm07;
			Bitmap bm08 = BitmapFactory.decodeResource(getResources(), R.drawable.n08);
			bitmaps[7] = bm08;
			Bitmap bm09 = BitmapFactory.decodeResource(getResources(), R.drawable.n09);
			bitmaps[8] = bm09;
			Bitmap bm010 = BitmapFactory.decodeResource(getResources(), R.drawable.n10);
			bitmaps[9] = bm010;
			Bitmap bm011 = BitmapFactory.decodeResource(getResources(), R.drawable.n11);
			bitmaps[10] = bm011;
			Bitmap bm012 = BitmapFactory.decodeResource(getResources(), R.drawable.n12);
			bitmaps[11] = bm012;
			Bitmap bm013 = BitmapFactory.decodeResource(getResources(), R.drawable.n13);
			bitmaps[12] = bm013;
			Bitmap bm014 = BitmapFactory.decodeResource(getResources(), R.drawable.n14);
			bitmaps[13] = bm014;
			Bitmap bm015 = BitmapFactory.decodeResource(getResources(), R.drawable.n15);
			bitmaps[14] = bm015;
			Bitmap bm016 = BitmapFactory.decodeResource(getResources(), R.drawable.n16);
			bitmaps[15] = bm016;
			Bitmap bm017 = BitmapFactory.decodeResource(getResources(), R.drawable.n17);
			bitmaps[16] = bm017;
			Bitmap bm018 = BitmapFactory.decodeResource(getResources(), R.drawable.n18);
			bitmaps[17] = bm018;
			Bitmap bm019 = BitmapFactory.decodeResource(getResources(), R.drawable.n19);
			bitmaps[18] = bm019;
			Bitmap bm020 = BitmapFactory.decodeResource(getResources(), R.drawable.n20);
			bitmaps[19] = bm020;
			Bitmap bm021 = BitmapFactory.decodeResource(getResources(), R.drawable.n21);
			bitmaps[20] = bm021;
			Bitmap bm022 = BitmapFactory.decodeResource(getResources(), R.drawable.n22);
			bitmaps[21] = bm022;
			Bitmap bm023 = BitmapFactory.decodeResource(getResources(), R.drawable.n23);
			bitmaps[22] = bm023;
			Bitmap bm024 = BitmapFactory.decodeResource(getResources(), R.drawable.n24);
			bitmaps[23] = bm024;
			Bitmap bm025 = BitmapFactory.decodeResource(getResources(), R.drawable.n25);
			bitmaps[24] = bm025;
			Bitmap bm026 = BitmapFactory.decodeResource(getResources(), R.drawable.n26);
			bitmaps[25] = bm026;
			Bitmap bm027 = BitmapFactory.decodeResource(getResources(), R.drawable.n27);
			bitmaps[26] = bm027;
			Bitmap bm028 = BitmapFactory.decodeResource(getResources(), R.drawable.n28);
			bitmaps[27] = bm028;
			Bitmap bm029 = BitmapFactory.decodeResource(getResources(), R.drawable.n29);
			bitmaps[28] = bm029;
			Bitmap bm030 = BitmapFactory.decodeResource(getResources(), R.drawable.n30);
			bitmaps[29] = bm030;
			Bitmap bm031 = BitmapFactory.decodeResource(getResources(), R.drawable.n31);
			bitmaps[30] = bm031;
			Bitmap bm032 = BitmapFactory.decodeResource(getResources(), R.drawable.n32);
			bitmaps[31] = bm032;
			Bitmap bm033 = BitmapFactory.decodeResource(getResources(), R.drawable.n33);
			bitmaps[32] = bm033;
			Bitmap bm034 = BitmapFactory.decodeResource(getResources(), R.drawable.n34);
			bitmaps[33] = bm034;
			Bitmap bm035 = BitmapFactory.decodeResource(getResources(), R.drawable.n35);
			bitmaps[34] = bm035;
			Bitmap bm036 = BitmapFactory.decodeResource(getResources(), R.drawable.n36);
			bitmaps[35] = bm036;
			Bitmap bm037 = BitmapFactory.decodeResource(getResources(), R.drawable.n37);
			bitmaps[36] = bm037;
			Bitmap bm038 = BitmapFactory.decodeResource(getResources(), R.drawable.n38);
			bitmaps[37] = bm038;
			Bitmap bm039 = BitmapFactory.decodeResource(getResources(), R.drawable.n39);
			bitmaps[38] = bm039;
			Bitmap bm040 = BitmapFactory.decodeResource(getResources(), R.drawable.n40);
			bitmaps[39] = bm040;
			Bitmap bm041 = BitmapFactory.decodeResource(getResources(), R.drawable.n41);
			bitmaps[40] = bm041;
			Bitmap bm042 = BitmapFactory.decodeResource(getResources(), R.drawable.n42);
			bitmaps[41] = bm042;
			Bitmap bm043 = BitmapFactory.decodeResource(getResources(), R.drawable.n43);
			bitmaps[42] = bm043;
			Bitmap bm044 = BitmapFactory.decodeResource(getResources(), R.drawable.n44);
			bitmaps[43] = bm044;
			Bitmap bm045 = BitmapFactory.decodeResource(getResources(), R.drawable.n45);
			bitmaps[44] = bm045;
			Bitmap bm046 = BitmapFactory.decodeResource(getResources(), R.drawable.n46);
			bitmaps[45] = bm046;
			Bitmap bm047 = BitmapFactory.decodeResource(getResources(), R.drawable.n47);
			bitmaps[46] = bm047;
			Bitmap bm048 = BitmapFactory.decodeResource(getResources(), R.drawable.n48);
			bitmaps[47] = bm048;
			Bitmap bm049 = BitmapFactory.decodeResource(getResources(), R.drawable.n49);
			bitmaps[48] = bm049;
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	@Override
	public Engine onCreateEngine() {
		// TODO Auto-generated method stub
		return new MyCustomWallpaperEngine();
	}
	
	
	private class MyCustomWallpaperEngine extends Engine{
		private final Handler handler = new Handler();
		private final Runnable drawRunner;
		private int fps = 1;
		private int width = 320;
		private int height = 480;
		private int picIdx = 0;
		private String size = "480, 854";
		private boolean visible = true;
		private Paint paint = new Paint();
		float de = 10.0f;
		
		public MyCustomWallpaperEngine(){
			paint.setAntiAlias(true);
			paint.setColor(Color.GREEN);
			paint.setStyle(Paint.Style.STROKE);
			paint.setStrokeJoin(Paint.Join.BEVEL);
			paint.setStrokeWidth(300f);
			drawRunner = new Runnable() {
				public void run() {
					drawFrame();
				}

			};
			this.fps = 20;
			setBitMaps();
		}

		protected void drawFrame() {
			// TODO Auto-generated method stub
			SurfaceHolder holder = getSurfaceHolder();
			Canvas canv = null;
			try{
				canv = holder.lockCanvas();
				if(canv != null){
//					canv.save();
					drawEye(canv);
//					canv.restore();
//					holder.unlockCanvasAndPost(canv);
				}
			}finally{
				if(canv != null)
					holder.unlockCanvasAndPost(canv);
			}
			handler.removeCallbacks(drawRunner);
			if(visible){
				handler.postDelayed(drawRunner, 1000 / this.fps);
			}
		}
		
		private void drawEye(Canvas canv) {
			// TODO Auto-generated method stub
			drawAnim(canv, bitmaps);
		}

		private void drawAnim(Canvas canv, Bitmap[] bitmaps) {
			// TODO Auto-generated method stub
//			for(int index = 0; index < this.picIdx; index++){
//				
//			}
			
			int i = this.picIdx;
			Bitmap resize_bm = resize(bitmaps[i]);
			int j = canv.getWidth() / 2;
			int k = this.width / 2;
			float left = j - k;
			int m = canv.getHeight() / 2;
			int n = this.height / 2;
			float top = m - n;
//			Parameters
//			bitmap  The bitmap to be drawn 
//			left  The position of the left side of the bitmap being drawn 
//			top  The position of the top side of the bitmap being drawn 
//			paint  The paint used to draw the bitmap (may be null)  

//			canv.save();
//			canv.rotate(de, (float)canv.getWidth()/2, (float)canv.getHeight()/2);
//			float f3 = (float)this.width / (float)bitmaps[0].getWidth();
//			float f6 = (float)this.height / (float)bitmaps[0].getHeight();
//			Matrix matrix = new Matrix();
//			matrix.postScale(f3, f6);
//			canv.drawBitmap(bitmaps[0], matrix, null);
////			canv.drawText("here", 50, 400, null);
//			canv.restore();
//			
//			de = de + 10f;
//			if(de == 360.0f)
//				de = 0.0f;
//			
			
			canv.drawBitmap(resize_bm, left, top, paint);
			picIdx = this.picIdx + 1;
			if(this.picIdx == 3){
				this.picIdx = 0;
			}
			

		}

		private Bitmap resize(Bitmap bitmap) {
			// TODO Auto-generated method stub
			Runtime.getRuntime().gc();

			float f3 = (float)this.width / (float)bitmap.getWidth();
//			float f6 = (float)m / (float)j;
			float f6 = (float)this.height / (float)bitmap.getHeight();
			Matrix matrix = new Matrix();
			matrix.postScale(f3, f6);
//			matrix.postRotate(de);
//			de = de + 10.0f;
//			if(de == 360.0f)
//				de = 0.0f;
//			matrix.postSkew(0.05f, 0.5f);
			return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
//			Parameters  
//			source  The bitmap we are subsetting 
//			x  The x coordinate of the first pixel in source 
//			y  The y coordinate of the first pixel in source 
//			width  The number of pixels in each row 
//			height  The number of rows 
//			m  Optional matrix to be applied to the pixels 
//			filter  true if the source should be filtered. Only applies if the matrix contains more than just translation. 

		}
		
//		 called when the drawing surface has been destroyed
		public void onSurfaceDestroyed (SurfaceHolder holder){
			super.onSurfaceDestroyed(holder);
			this.visible = false;
			handler.removeCallbacks(drawRunner);
		}
		
		@Override
		public void onVisibilityChanged(boolean visible) {
			this.visible = visible;
			if (visible) {
//				handler.post(drawRunner);
				drawFrame();
			} else {
				handler.removeCallbacks(drawRunner);
			}
		}

		
	}

}