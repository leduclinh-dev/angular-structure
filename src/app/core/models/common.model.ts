export class CommonModel {
  id: string;
  name: string;

  constructor(id?: string, name?: string) {
    this.id = id || null;
    this.name = name || '';
  }
}
