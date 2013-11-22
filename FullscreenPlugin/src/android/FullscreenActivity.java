package dk.ticonf.fullscreen;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;

public class FullscreenActivity extends Activity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      // remove title
      requestWindowFeature(Window.FEATURE_NO_TITLE);
      getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
          WindowManager.LayoutParams.FLAG_FULLSCREEN);
      setContentView(R.layout.main);
  }
}