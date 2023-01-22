for(a<- "hellow") println(a)


def discount(amt:Int)={
  if( amt <50) "Not eligible for discount"

  else if (amt>=50 && amt<100){
    amt*0.9
  }
  else{amt*0.85}
}

discount(10)
discount(70)
discount(600)







def echo5(msg:String): Unit ={
  var i =1
  while( i <=5){
    println(msg)
    i+=1
  }
}

//echo5("bhai")

def count()={
  var i =1
  while(i<=10){
    println(i)
    i+=1
  }
}

//count()


def echo4(msg:String)={
  for (i <- 1 to 4){
    println(msg)
  }
}
//echo4("bottle")