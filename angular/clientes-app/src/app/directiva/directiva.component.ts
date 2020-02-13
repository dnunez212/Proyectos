import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-directiva',
  templateUrl: './directiva.component.html'
})
export class DirectivaComponent {

  listaCurso: string[] = ['perro', 'gato', 'conejo', 'oveja'];
  habilitar =  true;
  constructor() { }
}
