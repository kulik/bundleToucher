bundleToucher
=============
This librarry simplify your life with Bundles. This lib allow to store some classes to bundle, and restore them.
Example


<code> 
public class SomeActivity extends Activity {

    @BundleTouch()
    private boolean mFirstParametrToSave;
    
    @BundleTouch()
    public int mSecondParametrtoSave = 10;
    
    @BundleTouch()
    private Integer mSomeIntegerValue;
    
    @BundleTouch()
    private String mStringValue;
    
    .....
    
    public void onCreate(Bundle savedState) {
        super.onCreate(outState);
        //restore values from savedState to object - this
         BundleToucher.restore(savedState, this);
         ....
    }
    
    public void onSaveInstanceState(Bundle outState) {
      super.onSaveInstanceState(outState)
      //save all marked @BundleTouch on to bundle 
        BundleToucher.save(outState, this)
    }

}
