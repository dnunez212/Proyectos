import { Injectable } from '@angular/core';
import { Cliente } from './cliente';
import { CLIENTES} from './cliente.json';
import { of, Observable, pipe } from 'rxjs';
import { HttpClient} from '@angular/common/http';
import { map } from 'rxjs/operators';


@Injectable()

export class ClienteService {

  private urlEndPoint = 'http://localhost:8080/api/clientes';

  constructor(private http: HttpClient) { }

  getClientes(): Observable<Cliente[]> {
        return this.http.get<Cliente[]>(this.urlEndPoint);
  }
}
