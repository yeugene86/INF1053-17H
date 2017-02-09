import { Component, OnInit } from '@angular/core';
import { Http } from "@angular/http";

import "rxjs/Rx";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public pokemon: Array<any>;
  
  constructor(private http: Http){
    this.pokemon= [];
  }
  public ngOnInit(){
    this.http.get("https://pokeapi.co/api/v2/pokemon?limit=151")
        .map( result => result.json())
        .flatMap(result => result.results)
        .subscribe(
            result => {
                this.pokemon.push(result);
            },
            error => {
                console.error(error);
            }
        );
  }
}
