package dk.ticonf.fullscreen;
 
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
//import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;
import java.lang.StringBuilder;


public class Fullscreen extends CordovaPlugin {
  public static final String ACTION_REQUEST_FULLSCREEN = "requestFullScreen";
  public static final String ACTION_CANCEL_FULLSCREEN = "cancelFullScreen";

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    //Activity activity = this.cordova.getActivity();
    //Window window = activity.getWindow();
    Context context = cordova.getActivity().getApplicationContext();
    Intent intent = new Intent(context, FullscreenActivity);
    context.startActivity(intent);
    /*
    if (ACTION_REQUEST_FULLSCREEN.equals(action)) {

      try {
        
        activity.requestWindowFeature(Window.FEATURE_NO_TITLE);        
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        window.clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        //activity.setContentView(this.webView);
        //this.webView.requestLayout();
        activity.getCurrentFocus().requestLayout();
        callbackContext.success();
        return true;
      } catch(Exception e) {
        return catchError(e, callbackContext);
      }

    } else if (ACTION_CANCEL_FULLSCREEN.equals(action)) {

      try {

        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        window.clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        //activity.setContentView(this.webView);
        //this.webView.requestLayout();
        activity.getCurrentFocus().requestLayout();
        callbackContext.success();
        return true;
      } catch(Exception e) {
        return catchError(e, callbackContext);
      }

    } else {

      StringBuilder sb = new StringBuilder();
      sb.append("Wrong action argument: ");
      sb.append(action);
      sb.append(". Should be either ");
      sb.append(ACTION_REQUEST_FULLSCREEN);
      sb.append(" or ");
      sb.append(ACTION_CANCEL_FULLSCREEN);
      System.err.println(sb.toString());
      callbackContext.error(sb.toString());
      return false;

    }*/
  }

  private boolean catchError(Exception e, CallbackContext callbackContext) {
    System.err.println("Exception: " + e.getMessage());
    callbackContext.error(e.getMessage());
    return false;
  }
}
