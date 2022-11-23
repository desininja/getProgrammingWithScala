def categorizationOfDay(n:Int) = {
  if(n==1 || n== 7){
    "weekend"
  }
  else if (n>1 && n<7){
    "week day"
  }
  else{
    "unknown"
  }
}

def label(n:Int)={

  if(n == 0){
    "neutral"
  }
  else if (n<0) "Negative"
  else "Positive"
}

label(-45)
label(0)
label(90873)
//categorizationOfDay(1)
//categorizationOfDay(4)
//categorizationOfDay(12)