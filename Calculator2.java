import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator2 extends Frame implements ActionListener
{

    Button Add, Sub, Mul, Div, Modu, EQ, Dot, sqrt, pow, cls, ln, log, fact, exp, sin, cos, tan, sinInv, cosInv, tanInv, Xinv, sq, exit,cbrt;
    Button b[]=new Button[10];
    TextField t;
    String s=null,s1="", s2="", s3="",s4=""; 
    int f=1;
    double res;
    Calculator2()
{
t=new TextField();
setSize(900,700);
setLayout(null);
setVisible(true);
add(t);
t.setBounds(200,150,458,50);
t.addActionListener(this);

int x=202,y=10,a=202,c=202; 

for(int i=0;i<10;i++)
{
   b[i]=new Button(""+i);
   if(i>0){
    if(i>=1 && i<=3){
        b[i].setBounds(x,202,50,50);
        add(b[i]);
        x+=50;   
    }
    ///

else if(i>=4 && i<=6){
b[i].setBounds(a,252,50,50);
add(b[i]);
a+=50;
}
else if(i>=7 && i<=9){
b[i].setBounds(c,302,50,50);
add(b[i]);
c+=50;
}
}
else { 
    b[i].setBounds(252,352,50,50);
     add(b[i]);
}
}

for (int i=0;i<10;i++){
b[i].addActionListener(this);
}
Add=new Button("+");
add(Add);
Add.setBounds(352,202,50,50);
Add.addActionListener(this);

Sub=new Button("-");
add(Sub);

/////

Sub.setBounds(352,252,50,50);
Sub.addActionListener(this);

y=10;

Mul=new Button("*");
add (Mul);
Mul.setBounds(352,302, 50, 50); 
Mul.addActionListener(this);

Div=new Button("/");
add(Div);
Div.setBounds(352,352,50,50);
Div.addActionListener(this);

EQ=new Button("=");
add(EQ);
EQ.setBounds(302,352,50,50); 
EQ.addActionListener(this);

Dot=new Button(".");
add(Dot);
Dot.setBounds (202,352,50,50);
Dot.addActionListener(this);

Modu=new Button("%");
add(Modu);
Modu.setBounds (452,202,50,50);
Modu.addActionListener(this);
///////

sqrt=new Button("SQRT");
add(sqrt);
sqrt.setBounds(452,252,50,50); 
sqrt.addActionListener(this);

pow=new Button("^");
add(pow);
pow.setBounds(452,302,50,50);
pow.addActionListener(this);

cls=new Button("Clear");
add(cls);
cls.setBounds(452,352,50,50);
cls.addActionListener(this);

ln=new Button("ln");
add(ln);
ln.setBounds(502,202,50,50);
ln.addActionListener(this);

log=new Button("log");
add(log);
log.setBounds(502,252,50,50);
log.addActionListener(this);

fact=new Button("!");
add(fact);
fact.setBounds (502,302,50,50);
fact.addActionListener(this);
//////


exp=new Button("e");
add(exp);
exp.setBounds(502,352,50,50); 
exp.addActionListener(this);

sin=new Button( "Sin" );
add(sin);
sin.setBounds(552,202,50,50);
sin.addActionListener(this);

cos=new Button("Cos");
add(cos);
cos.setBounds(552,252,50,50);
cos.addActionListener(this);

tan=new Button("tan");
add(tan);
tan.setBounds(552,302,50,50);
tan.addActionListener(this);

sinInv=new Button("SinInv");
add(sinInv);
sinInv.setBounds(552,352,50,50);
sinInv.addActionListener(this);
///////

cosInv=new Button("CosInv");
add(cosInv);
cosInv.setBounds (602,202,50,50);
cosInv.addActionListener(this);

tanInv=new Button("tanInv");
add(tanInv); 
tanInv.setBounds (602,252,50,50);
tanInv.addActionListener(this);

Xinv=new Button("Xinv"); 
add(Xinv);
Xinv.setBounds(602,302,50,50);
Xinv.addActionListener(this);

sq=new Button("SQ");
add(sq);
sq.setBounds(602,352,50,50);
sq.addActionListener(this);

exit=new Button("exit");
add(exit); 
exit.setBounds (380,440,100,50); 
exit.addActionListener(this);

}
//////


public void actionPerformed (ActionEvent e)
{
s=e.getActionCommand();
char ch[]=s.toCharArray();
if((ch[0]>=48 && ch[0]<=57) || ch[0]=='.')
{
s1=t.getText()+s;
t.setText(s1);
}

if(e.getSource()==Add)
{
s2=t.getText();
t.setText(" ");
s3="+";
}

if(e.getSource()==Sub)
{
s2=t.getText();
t.setText("");
s3="-";
}

if(e.getSource()==Mul)
{
s2=t.getText(); 
t.setText("");
s3="*";
}

/////

if(e.getSource()==Div)
{
 s2=t.getText();
 t.setText(""); 
 s3="/";
}


 if(e.getSource()==Modu)
{ 
s2=t.getText(); 
t.setText(""); 
s3="%";
}


if(e.getSource()==sqrt)
{
s2=t.getText(); 
t.setText(" ");
s3="sqrt";
}

if(e.getSource()==pow)
{
s2=t.getText();
t.setText(""); 
s3="pow";
}

if(e.getSource()==cls)
{
s2=t.getText();
t.setText(""); 
s3="cls";
}
/////


if(e.getSource()==ln)
{
s2=t.getText();
t.setText("");
s3="ln";
}

if(e.getSource()==log)
{
s2=t.getText(); 
t.setText("");
s3="log";
}

if(e.getSource()==fact)
{
s2=t.getText(); 
t.setText(" "); 
s3="fact";
}

if(e.getSource()==exp)
{
s2=t.getText(); 
t.setText("");
s3="exp";
}

//////

if(e.getSource()==sin)
{
s2=t.getText(); 
t.setText("");
s3= "sin";
}

if(e.getSource()==cos)
{
s2=t.getText(); 
t.setText("");
s3="cos";
}

if(e.getSource()==tan)
{
s2=t.getText();
t.setText("");
s3="tan";
} 

if(e.getSource()==sinInv)
{
s2=t.getText(); 
t.setText(" ");
s3="sinInv";
}

if(e.getSource()==cosInv)
{
s2=t.getText();
t.setText("");
s3="cosInv";
}

if(e.getSource() ==tanInv)
{
s2=t.getText(); 
t.setText("");
s3= "tanInv";
}

if(e.getSource()==Xinv)
{
s2=t.getText(); 
t.setText(""); 
s3= "Xinv";
}

if(e.getSource()==sq) 
{
s2=t.getText(); 
t.setText("");
s3="sq";
}

if(e.getSource()==exit)
{
dispose();
}


/////////


if(e.getSource()==EQ)
{
s4=t.getText();

System.out.println(s4);
if(s3.equals("+"))
{
res=Float.parseFloat(s2)+Float.parseFloat(s4.trim());
t.setText(""+res);
}

if(s3.equals("-"))
{
res=Float.parseFloat(s2)-Float.parseFloat(s4.trim());
t.setText(""+res);
}

if(s3.equals("*"))
{
res=Float.parseFloat(s2)*Float.parseFloat(s4.trim());
t.setText(""+res);
}

if(s3.equals("/"))
{
res=Float.parseFloat(s2)/Float.parseFloat(s4.trim());
t.setText(""+res);
}

if(s3.equals("%"))
{
res=Float.parseFloat(s2)%Float.parseFloat(s4.trim());
t.setText(""+res);
}

if(s3.equals("exp"))
{
res=Math.exp(Double.parseDouble(s2));
t.setText(""+res);
}

if(s3.equals("ln"))
{
res=Math.log(Double.parseDouble(s2));
t.setText(""+res);
}

if(s3.equals("log"))
{
res=Math.log10(Double.parseDouble(s2));
t.setText(""+res);
}

if(s3.equals("pow"))
{
res=Math.pow(Double.parseDouble(s2),Double.parseDouble(s4.trim()));
t.setText(""+res);
}

if(s3.equals("sqrt"))
{
res=Math.sqrt(Double.parseDouble(s2));
t.setText(""+res);
}

////////////

if(s3.equals("sin"))
{
res=Math.sin(Double.parseDouble(s2));
t.setText(""+res);
}

if(s3.equals("cos"))
{
res=Math.cos(Double.parseDouble(s2));
t.setText(""+res);
}

if(s3.equals("tan"))
{
res=Math.tan(Double.parseDouble(s2));
t.setText(""+res);
}

if(s3.equals("sinInv"))
{
res=Math.asin (Double.parseDouble(s2));
t.setText(""+res);
}

if(s3.equals("cosInv"))
{
res=Math.acos (Double.parseDouble(s2));
t.setText(""+res);
} 

if(s3.equals("tanInv"))
{
res=Math.atan(Double.parseDouble(s2));
t.setText(""+res);
}

if(s3.equals("Xinv"))
{
res=1/(Double.parseDouble(s2));
t.setText(""+res);
}

if(s3.equals("sq"))
{
res=Math.pow(Double.parseDouble(s2),2);
t.setText(""+res);
}

if(s3.equals("fact"))
{
res=Double.parseDouble(s2); 
for(int i=1;i<=res;i++)
{
f*=i;
} 
t.setText(""+f);
}


}
}


public void paint (Graphics g)
{
setBackground (Color.black);
g.setColor(Color.red); 
g.drawRect(200,200,450,200);
}


public static void main(String[] args)
{
 new Calculator2();
}
}
