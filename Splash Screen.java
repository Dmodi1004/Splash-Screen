Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4500);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    finishAffinity();
                    startActivity(intent);
                }
            }
        };
        thread.start();