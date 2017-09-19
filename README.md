# Android Toast 工具类(持续更新中……）
 ![ToastUtls](/app/src/main/assets/ToastUtils.gif)

### 使用说明：

```
	dependencies {
	        compile 'com.github.SiberiaDante:ToastUtils:v1.0.2'
	}

```
* 在你的项目中初始化
```
ToastApp.initToastUtils(getApplicationContext());
```
* 使用单例ToastUtil时注意一点：比如使用了带位置的方法后，下次再使用不带位置的单例方法时，会显示成上次方法的Toast的位置所以强烈建议：全局统一的Toast使用该类中的单例方法，一旦使用了一种以上的方法，需要在不常使用的方法调用后调用resetToast()方法，重置Toast位置等（不适重置Toast对象）
   * 举例：
   * 全局一般使用的Toast是底部弹出一行简单的文字，调用：
   * ToastUtils.toast("常规的Toast方法)；
   * 然后我们有特殊需要，要居中显示一个Toast提示用户，调用：
   * ToastUtil.showSingletonText("居中显示",Toast.LENGTH_SHORT,Gravity.CENTER);
   * 这个方法调用完，其实相当于是更改了Toast的对象。不再是第一个我们常规使用的方法中所创建的，所以，
   * 我们需要重置Toast对象，其实就是创建一个新的常规对象
* [ToastUtil] :toast吐司工具类(看下代码自己就可以用Toast写出各种各样的界面）
    * showSingletonLong(String content)：Toast文本，单例，长时间
    * showSingletonShort(String content)：Toast文本，单例，短时间
    * showTextShort(String content)：Toast文本，非单例，短时间
    * showTextLong(String content)：Toast文本，非单例，长时间
    * showSingletonText(String content,int duration,int position ):Toast文本，自定义时长、位置
    * showSingletonImageCenter(int resId, int duration): Toast一张图片，单例，居中
    * showImageCenter(int resId,int duration)：Toast一张图片，非单例，居中
    * showSingletonImage(int resId, int duration, int position):Toast一张图片，单例，自定义位置
    * showImage(int resId, int duration, int position)：Toast一张图片，非单例，自定义位置
    * showImage(Bitmap bitmap, int duration, int position):Toast一张图片，非单例，自定义位置
    * showITSingleton(int resId, String content, int duration, int position)：Toast图文，单例，自定义时长，自定义位置
    * showIT(int resId, String content, int duration, int position)：Toast图文，非单例，自定义时长，自定义位置
    * showLines(List<String> contents, int size):Toast 多行文本 非单例
    * showSingletonLines(List<String> contents, int size):Toast 多行文本 单例
    * showLayout(View view, int duration, int position):Toast 自定义布局 非单例
    * howSingletonLayout(View view, int duration, int position):Toast 自定义布局 单例
    * showThread(String url)：异步线程下载图片并Toast
    * cancel():取消一个Toast，当弹出多个toast时，只会在最后一次toast被创建时取消
    * cancelAll():取消创建的所有的toast
    * resetToast()：重置Toast对象
## 版本更新
* v1.0.2
    * 增加resetToast()方法：重置Toast对象,防止复用其他Toast对象
* 1.0.1