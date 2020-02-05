package Analizador;

import java.util.LinkedList;
import java_cup.runtime.Symbol;
%%
%{	

    LinkedList<String> errores = null;

    public void setErrores(LinkedList<String> lista) {
        errores = lista;
    }
%}

%public 
%class StringScanner
%cupsym SSimbolos
%cup
%char
%column
%full
%line
%ignorecase
%unicode

num = [0-9]+(\.[0-9]+)?
id = (_|[a-zA-Z])([a-zA-Z]|[0-9]|_)*
strng = ([\"]([^\\\"\n])*[\"]) 
%%


<YYINITIAL> {
        "var"                           { return new Symbol(SSimbolos.var, yycolumn, yyline, yytext()); }
        "print"                         { return new Symbol(SSimbolos.print, yycolumn, yyline, yytext()); }
        "if"                         { return new Symbol(SSimbolos.iff, yycolumn, yyline, yytext()); }
        "{"                             { return new Symbol(SSimbolos.cor_open, yycolumn, yyline, yytext()); }
        "}"                             { return new Symbol(SSimbolos.cor_close, yycolumn, yyline, yytext()); }
        ";"                             { return new Symbol(SSimbolos.dotcoma, yycolumn, yyline, yytext()); }
        "="                             { return new Symbol(SSimbolos.asig, yycolumn, yyline, yytext()); }
	"+"				{ return new Symbol(SSimbolos.plus, yycolumn, yyline, yytext()); }
	"-"				{ return new Symbol(SSimbolos.minus, yycolumn, yyline, yytext()); }
	"*"				{ return new Symbol(SSimbolos.mult, yycolumn, yyline, yytext()); }
	"/"				{ return new Symbol(SSimbolos.div, yycolumn, yyline, yytext()); }
	"("				{ return new Symbol(SSimbolos.par_open, yycolumn, yyline, yytext()); }
	")"				{ return new Symbol(SSimbolos.par_close, yycolumn, yyline, yytext()); }
	"=="			{ return new Symbol(SSimbolos.igual, yycolumn, yyline, yytext()); }
	"!="			{ return new Symbol(SSimbolos.nigual, yycolumn, yyline, yytext()); }
	"<"				{ return new Symbol(SSimbolos.menor, yycolumn, yyline, yytext()); }
	">"				{ return new Symbol(SSimbolos.mayor, yycolumn, yyline, yytext()); }
	"<="			{ return new Symbol(SSimbolos.menor_igu, yycolumn, yyline, yytext()); }
	">="			{ return new Symbol(SSimbolos.mayor_igu, yycolumn, yyline, yytext()); }
	"||"				{ return new Symbol(SSimbolos.or, yycolumn, yyline, yytext()); }
	"&&"				{ return new Symbol(SSimbolos.and, yycolumn, yyline, yytext()); }
	"++"				{ return new Symbol(SSimbolos.inc, yycolumn, yyline, yytext()); }
	"--"				{ return new Symbol(SSimbolos.dec, yycolumn, yyline, yytext()); }
	//VALUES
	{num}                           { return new Symbol(SSimbolos.num, yycolumn, yyline, yytext()); }
        {id}                            { return new Symbol(SSimbolos.id, yycolumn, yyline, yytext()); }
        {strng}                         { return new Symbol(SSimbolos.strng, yycolumn, yyline, yytext()); }
	//WHITESPACES
	[ \t\r\n\f]     {}
	//ERROR
	.				{ errores.add("Error Léxico: " + yytext() + " en fila: " + yyline + ", columna: " + yycolumn + "."); }
}